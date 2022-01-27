package Project;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Tuğçe DURMAZ - 190316051
 *         Süleyman Burak GÜL - 190316034
 *         Ahmet Furkan AKDAMAR - 190316068
 */


public class question5 {
    public static TreeMap<String,Integer> myMap = new TreeMap<>();

    public static void quest5(){
        System.out.println("*****************************************...Welcome to Java Program 5...*****************************************\n");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");

        String input = scanner.nextLine();

        String[] tokens = input.split(" ");
        int count;

        for(String token : tokens)
        {
            String word = token.toLowerCase();
            if(myMap.containsKey(word))
            {
                count = myMap.get(word);
                myMap.put(word,count+1);
            }
            else
                myMap.put(word,1);
        }
        System.out.print("Word Counts in String : ");
        System.out.println(myMap);
    }


}



