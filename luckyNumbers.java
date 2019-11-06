/*Author : Aderonke Adebayo
 *Date : 11/5/2019
 *Project: Assignment 2
 */
import java.util.ArrayList;
import java.util.Scanner;

public class luckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        ArrayList list = new ArrayList();

            System.out.println("This code is asking you to do the following.");
            System.out.println("1. Add to a list");
            System.out.println("2. Remove from a list");
            System.out.println("3. Sort the added list");
            System.out.println("4. Use isEmpty");
            System.out.println("5. Print out a particular index from the added list");
            System.out.println("6. Exit");
        do {
            System.out.print("select an option from the asking above : ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    if (option == 1) {
                        do {
                            System.out.print("Enter number to add: ");
                            list.add(sc.nextInt());
                        } while (list.size() < 10); // Taking a maximum of 10 input

                        System.out.println("List is at maximum numbers allowed");
                    }
                    break;
                case 2:
                    if (option == 2) {
                        System.out.print("Enter number to remove: ");
                        Integer number = sc.nextInt();// Taking number to be removed from user
                        if (list.remove(number)) {
                            System.out.println("Number removed successfully.");
                        } else {
                            System.out.println("Number not found.");
                        }
                    } else {
                        System.out.println("List is already empty.");
                    }
                    break;

                case 3:
                    if (option == 3) {
                        list.sort(null);
                        System.out.println("Your sorted list is :" );
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print(list.get(i));
                            System.out.println();
                        }
                    }else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 4:
                    if (option == 4) {
                        list.isEmpty();
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("List is not empty.");
                    }
                    break;
                case 5:
                    if (option == 5) {
                        System.out.print("Enter index value to display number: ");
                        int index = sc.nextInt();
                        if (0 <= index && index < list.size()) {
                            System.out.println("Number at index " + index + " is " + list.get(index));
                        } else {
                            System.out.println("Invalid Index value.");
                        }
                    }
                    break;
                    case 6:
                            if (option == 6) {
                                System.out.println("Your Inputed lucky numbers are " +list);
                            }
                            break;
                    }
            }
            while (option < 6) ; // code will continue until user input a number greater
                                // than is from the main asking option

        }
    }
