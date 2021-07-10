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
public class WordReverse {
    WordReverse(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Character Reverse\nEnter the String");
        try{
        String s = sc.nextLine();
         String[] s1 = s.split(" ");
         for(int i=s1.length-1;i>=0;i--){
         System.out.print(s1[i]+" ");    
         }
        }
        catch(Exception e){
            System.out.println("Please enter the valid input");
        }
    }
    
}
