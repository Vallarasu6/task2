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
public class SecondLargest {
    SecondLargest(){
        int max=0,secmax=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Second Largest integer\nEnter the number of values you want to enter");
    try{
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //2 5 4 1 7
        for(int i=0;i<n;i++){
            if(a[i]>max && a[i]>secmax){
                secmax=max;
                max=a[i];
                
            }
            else if(a[i]>secmax && a[i]<max){
                secmax = a[i];
            }
        }
        
         System.out.println("The second largest value is "+secmax);
    }
    catch(Exception e){
        System.out.println("Please enter the valid input");
    }
    }
}