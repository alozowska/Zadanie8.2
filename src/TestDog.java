import java.util.Arrays;
import java.util.Scanner;

public class TestDog {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("podaj nazwę");
            String name=scan.nextLine();
            System.out.println("podaj chip");
            int chip=scan.nextInt();
            scan.nextLine();
            Dog nextDog = new Dog(name, chip);
            if (!contains(nextDog, dogs)) {
                dogs[i] = nextDog;
            } else
                System.out.println("Duplikat, podaj jeszcze raz");
        }
        System.out.println(Arrays.toString(dogs));
    }

    private static boolean contains(Dog d, Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            if (d.equals(dogs[i])) {
                return true;
            }
        }
        return false;
    }
}
