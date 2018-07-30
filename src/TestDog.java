import java.util.Scanner;

public class TestDog {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj nazwę i numer chip");
        dogs[0] = new Dog(scan.nextLine(), scan.nextInt());
        scan.nextLine();
        for (int i = 1; i < dogs.length; i++) {
            System.out.println("podaj nazwę i numer chip");
            dogs[i] = new Dog(scan.nextLine(), scan.nextInt());
            scan.nextLine();
            if (dogs[1].equals(dogs[0])||dogs[2].equals(dogs[0])||dogs[2].equals(dogs[1])) {
                System.out.println("Duplikat, podaj jeszcze raz nazwę i chip");

            } else {



            }

        }


    }
}

