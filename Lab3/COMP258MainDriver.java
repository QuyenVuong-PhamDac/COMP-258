package Lab3;

import java.util.Scanner;

public class COMP258MainDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== MAIN MENU =====");

            System.out.println("1. Manage data with ArrayManager");
            System.out.println("2. Manage data with LinkedList");
            System.out.println("3. Exit");

            choice = input.nextInt();

            switch (choice) {

                // ARRAY MANAGER
                case 1:

                    arrayManagerMenu(input);

                    break;

                // LINKED LIST
                case 2:

                    linkedListMenu(input);

                    break;

                case 3:

                    System.out.println("Exiting...");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        input.close();
    }

    // ARRAY MANAGER MENU
    public static void arrayManagerMenu(Scanner input) {

        Widget[] widgets = {

                new Widget(1001, "Gadget", 546),
                new Widget(1005, "Thingamabob", 20),
                new Widget(1004, "Whatsit", 1354),
                new Widget(1002, "Gizmo", 486),
                new Widget(1003, "Whozit", 1465)
        };

        ArrayManager manager = new ArrayManager(10);

        for (Widget w : widgets) {
            manager.addItem(w);
        }

        int choice;

        do {

            System.out.println("\n===== ARRAY MANAGER =====");

            System.out.println("1. Print List");
            System.out.println("2. Print newest Widget");
            System.out.println("3. Print Widget info by ID");
            System.out.println("4. Exit");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    manager.printItems();

                    break;

                case 2:

                    System.out.println(manager.FindMax());

                    break;

                case 3:

                    System.out.print("Enter Widget ID: ");

                    int id = input.nextInt();

                    Widget search = new Widget(id, "", 0);

                    Object found = manager.Find(search);

                    if (found != null) {

                        System.out.println(found);
                    }

                    else {

                        System.out.println("Widget not found.");
                    }

                    break;

                case 4:

                    System.out.println("Exiting ArrayManager.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    // LINKED LIST MENU
    public static void linkedListMenu(Scanner input) {

        Widget[] widgets = {

                new Widget(1001, "Gadget", 546),
                new Widget(1005, "Thingamabob", 20),
                new Widget(1004, "Whatsit", 1354),
                new Widget(1002, "Gizmo", 486),
                new Widget(1003, "Whozit", 1465)
        };

        LinkedList list = new LinkedList();

        for (Widget w : widgets) {

            if (list.getSize() == 0) {

                list.addBefore(w);
            }

            else {

                list.addAfter(w);
                list.advance();
            }
        }

        list.start();

        int choice;

        do {

            System.out.println("\n===== LINKED LIST =====");

            System.out.println("1. Set current to start");
            System.out.println("2. Advance current");
            System.out.println("3. Add before current");
            System.out.println("4. Add after current");
            System.out.println("5. Delete current");
            System.out.println("6. Print current");
            System.out.println("7. Print list");
            System.out.println("8. Print newest Widget");
            System.out.println("9. Print Widget info by ID");
            System.out.println("10. Exit");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    list.start();

                    break;

                case 2:

                    list.advance();

                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int id1 = input.nextInt();

                    System.out.print("Enter Name: ");
                    String name1 = input.next();

                    System.out.print("Enter Stock: ");
                    int stock1 = input.nextInt();

                    list.addBefore(new Widget(id1, name1, stock1));

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int id2 = input.nextInt();

                    System.out.print("Enter Name: ");
                    String name2 = input.next();

                    System.out.print("Enter Stock: ");
                    int stock2 = input.nextInt();

                    list.addAfter(new Widget(id2, name2, stock2));

                    break;

                case 5:

                    list.removeCurrent();

                    break;

                case 6:

                    list.printCurrent();

                    break;

                case 7:

                    list.printList();

                    break;

                case 8:

                    System.out.println(list.FindMax());

                    break;

                case 9:

                    System.out.print("Enter Widget ID: ");

                    int id = input.nextInt();

                    Widget search = new Widget(id, "", 0);

                    Object found = list.Find(search);

                    if (found != null) {

                        System.out.println(found);
                    }

                    else {

                        System.out.println("Widget not found.");
                    }

                    break;

                case 10:

                    System.out.println("Exiting LinkedList.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);
    }
}