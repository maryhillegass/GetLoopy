import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.print("Roll\tDie1\tDie2\tDie3\tSum\n");
        System.out.println("------------------------------------");
        int counter = 1;
        boolean done = false;
        //Do while not equal dies
        do{
            int dieA = rnd.nextInt(6)+1;
            int dieB = rnd.nextInt(6)+1;
            int dieC = rnd.nextInt(6)+1;
            System.out.print(counter + "\t\t" + dieA + "\t\t" + dieB + "\t\t" + dieC + "\t\t");
            int sum = dieA + dieB + dieC;
            counter++;
            System.out.println(sum);
            if (dieA == dieB && dieB == dieC ) done = true;
        }while (!done);
    }
}
