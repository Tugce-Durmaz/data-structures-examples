package Project;

import java.util.*;

/**
 *
 * @author Ahmet Furkan AKDAMAR - 190316068
 *         Tuğçe DURMAZ - 190316051
 *         Süleyman Burak GÜL - 190316034
 */

public class question2 {
    public static ArrayList <Integer> list1 = new ArrayList<>();
    public static ArrayList <Integer> list2 = new ArrayList<>();
    public static TreeSet <Integer> temp = new TreeSet<>();
    public static ArrayList <Integer> joinedList = new ArrayList<>();

    public static void joining (){
        System.out.println("*****************************************...Welcome to Java Program 2...*****************************************\n");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        list1.add(7);
        list1.add(8);
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(3);
        list1.add(2);
        list1.add(123);
        list1.add(99);
        list2.add(9);
        list2.add(1);
        list2.add(5);
        list2.add(159);
        list2.add(5796);

        temp.addAll(list1);
        temp.addAll(list2);
        joinedList.addAll(temp);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Joined List: " + joinedList + "\n");
    }

}










