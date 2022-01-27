package Project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ahmet Furkan AKDAMAR - 190316068
 *         Tuğçe DURMAZ - 190316051
 *         Süleyman Burak GÜL - 190316034
 */

public class question1 {
    public static ArrayList<Long> number = new ArrayList<>();

    public static void controlAndAdd(){
        Scanner input = new Scanner(System.in);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        System.out.println("*****************************************...Welcome to Java Program 1...*****************************************\n");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        int count=0;

        for (int i =0; i <= count; i++) {
            System.out.println("Enter number: ");
            long a = input.nextLong();

            while (!number.contains(a)) {
                System.out.println("Adding number...");
                number.add(a);

                count++;
            }
            System.out.println("Numbers in ArrayList: " + number);
        }
        System.out.println("The program terminates because the ArrayList contains the same number...\n");

    }
}


