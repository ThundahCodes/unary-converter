import java.lang.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;




public class unary{

    //This method has a List which iterates itself as many times as the number size is
    public static void encode(int num) {
        List<String> keep = new ArrayList<>();
        int i = 0;
     for (i = 0; i < num; i++) {
         keep.add("1");
     }
     for (String str:keep) {
         System.out.println(str);
         
        }
        System.out.println(0);
    }

    //This method uses a Stringbuilder, where we can take the length of it to iterate a count number
    public static void decode(String dec) {
        
        StringBuilder str = new StringBuilder();
        int count = 0;
        str.append(dec);
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println(count-1);
    }

        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            Scanner secondScan = new Scanner(System.in);
            System.out.println("Do you want to encode (e) or decode(d) a number?");
            char choiceStr = scan.next().charAt(0);
            if(choiceStr == 'e') {
                System.out.println("Which number do you want to encode?");
                int encodeNum = scan.nextInt();
                encode(encodeNum);
            }
            else if(choiceStr == 'd') {
                System.out.println("Which number do you want to decode?");
                String decodeStr = secondScan.nextLine();
                decode(decodeStr);

            }
            else {
                System.out.println("Wrong input!");
            }

        }
    }

