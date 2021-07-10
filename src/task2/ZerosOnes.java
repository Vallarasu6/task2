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
public class ZerosOnes {
    ZerosOnes(){
        int count=0;
        Scanner sc = new Scanner(System.in);
    System.out.println("Zeros and Ones\nEnter the number of values you want to enter");
    try{
          int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        }
            
    
    catch(Exception e){
        System.out.println("Please enter the valid input");
    }
    }
    
}
