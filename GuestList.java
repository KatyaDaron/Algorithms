import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

        do {
            System.out.println();
            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null) {
                        System.out.println(guests[i]);
                    }
                }
            } else if (option == 2) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            } else if (option == 3) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
                String[] temp = new String[guests.length];
                int it = 0;
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null) {
                        temp[it] = guests[i];
                        it++;
                    }
                }
                guests = temp;
            } else if (option == 4) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);

    }

}