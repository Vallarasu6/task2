/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class MaxMinSort {
    MaxMinSort(){
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Max Min ALternate Sorting\nEnter the number of values you want to enter");
    try{
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=a[n-1]){
            System.out.println(a[i]);
            System.out.println(a[n-1]);
            n--;
            }
        }
        if(n%2!=0){
        System.out.println(a[(n/2)+1]);
        }
    }
    catch(Exception e){
        System.out.println("Please enter the valid input");
    }
    }
    }

