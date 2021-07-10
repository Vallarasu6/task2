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
public class OverloadConstructor {
    String name;
    String id;
    int age;
    OverloadConstructor(String n,int a){
        name=n;
        age = a;
        System.out.println("Name is"+ name+"\nAge is"+age);
    }
    OverloadConstructor(String n,int a,String i){
        name=n;
        age = a;
        id = i;
        System.out.println("Name is"+ name+"\nAge is"+age+"\nId is "+id);
    }
    OverloadConstructor(String n){
        name=n;
        System.out.println("Name is"+ name);
    }
    
}
