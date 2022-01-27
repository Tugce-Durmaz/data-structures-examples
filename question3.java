package Project;
import java.util.ArrayList;

/**
 *
 * @author Süleyman Burak GÜL - 190316034
 *         Tuğçe DURMAZ - 190316051
 *         Ahmet Furkan AKDAMAR - 190316068
 */

public class question3 {
    public static ArrayList<String> list = new ArrayList<>();

    public question3(){

    }

    public void hunter(){
        System.out.println("*****************************************...Welcome to Java Program 3...*****************************************\n");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        for(int i = 0; i < list.size();i++){
            for(int a = i+1; a < list.size();a++){
                if(list.get(i) == list.get(a)){
                    list.remove(a);
                }
                else{

                }
            }
            System.out.print(" " + list.get(i));
        }
    }
}

