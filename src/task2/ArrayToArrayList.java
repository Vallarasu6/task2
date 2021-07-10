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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class ArrayToArrayList {
    ArrayToArrayList(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Array to Array list\nEnter the number of Strings you want to enter");
         try{
             int n = sc.nextInt();
             String[] s = new String[n]; 
             for(int i=0;i<n;i++){
                 s[i] = sc.next();
             }
             for(int i=0;i<n;i++){
                System.out.println(s[i]);
             }
             List al = Arrays.asList(s);
             System.out.println(al);
         }
         catch(Exception e){
             System.out.println("Please enter the valid input");
         }
    }
    
}
