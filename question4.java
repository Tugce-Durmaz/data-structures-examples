package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Süleyman Burak GÜL - 190316034
 *         Tuğçe DURMAZ - 190316051
 *         Ahmet Furkan AKDAMAR - 190316068
 */


public class question4 {
    public static HashSet<String> words = new HashSet<String>();


    public static void DisWordCalSizeWithReader(String w) {
        System.out.println("------------------------------");
        System.out.println("    DISTINCT WORD COUNTER");
        w = w.toLowerCase();
        System.out.println(w);
        distinctWordListWithoutCounter(w);
    }
    public static void DisWordCalSizeWithReaderCon(String w) {
        System.out.println(w);
        distinctWordListWithoutCounter(w);
    }

    public static int distinctWordListWithoutCounter(String text) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words.size();
    }
    public static void TxtReaderDis() throws FileNotFoundException, IOException {
        System.out.println("*****************************************...Welcome to Java Program 4...*****************************************\n");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        words.clear();
        // WARNİNG!!!: Sir, since the address of the .txt file will be different, it may give an error while you are testing it.
        File fr = new File("C:\\Users\\ahmet\\IdeaProjects\\Lab1\\src\\Project\\ProjectEx4Text.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fr)));
        String s = br.readLine();
        DisWordCalSizeWithReader(s);
        while(s != null){
            s = br.readLine();
            if( s == null){
                System.out.println("------------------------------");
                break;
            }
            DisWordCalSizeWithReaderCon(s);
        }

        System.out.println("The amount of word without any duplication is " + (words.size()-1) + ".\n");
    }
}

