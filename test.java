package Project;

import static Project.question1.controlAndAdd ;
import static Project.question2.joining;
import static Project.question3.list;
import java.io.IOException;
import static Project.question4.TxtReaderDis;
import static Project.question4.distinctWordListWithoutCounter;
import static Project.question5.quest5 ;


/**
 *
 * @author Süleyman Burak GÜL - 190316034
 *         Tuğçe DURMAZ - 190316051
 *         Ahmet Furkan AKDAMAR - 190316068
 */

public class test {
    public static void main(String[] args) throws IOException {

        ////////Question1/////
        controlAndAdd();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");

        //////Question2///////
        joining();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");

        //////Question3///////
        question3 program = new question3();
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("burak");
        list.add("yea");
        list.add("this");
        list.add("is");
        list.add("true");
        list.add("Im");
        list.add("burak");
        program.hunter();

        System.out.println("\n\n/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");

        //////Question4///////
        TxtReaderDis();

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");

        //////Question5///////
        quest5();


    }

}











































   /* public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Long> number = new ArrayList<>();

        System.out.println("Welcome to Java Program 1...");



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
        System.out.println("ArrayListte aynı sayıdan olduğu için program sonlandırılıyor...");

    }*/





