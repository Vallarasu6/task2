/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class CharReverse {
    CharReverse(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Character Reverse\nEnter the String");
        try{
            String s = sc.nextLine();
             System.out.println("The reverse String is\n");
            for(int i=s.length()-1;i>=0;i--){
                 System.out.print(s.charAt(i));
            }
        }
        catch(Exception e){
            System.out.println("Please Enter the valid input");
        }
    }
}
