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
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Programs LIst\n1.Second Largest Element\n2.Zeros and Ones\n3.Max Min Sorting\n4.Character Reverse\n5.Word reverse\n6.Array to Array list \n7.Pojo Class"
                + "\n8.Constructor Overloading\n9.Enum color\n10.Text File\nEnter your choice");
        int n = sc.nextInt();
        switch(n){
            case 1:{
         SecondLargest obj1 = new SecondLargest();
        break;
            }
            case 2:{
         ZerosOnes obj2 = new ZerosOnes();
        break;
            }
            case 3:{
         MaxMinSort obj3 = new MaxMinSort();
        break;
            }
            case 4:{
         CharReverse obj4 = new CharReverse();
        break;
            }
             case 5:{
         WordReverse obj5 = new WordReverse();
        break;
            }
             case 6:{
         ArrayToArrayList obj6 = new ArrayToArrayList();
        break;
            }
             case 7:{
         PojoClass obj7 = new PojoClass();
         obj7.setName("Vallarasu");
         obj7.setId("A10");
         obj7.setSal(60000);
         obj7.setRollnum(100);
         obj7.setRole("Developer");
         System.out.println(obj7);
        break;
            }
              case 8:{
         OverloadConstructor obj8= new OverloadConstructor("Valla",34);
         OverloadConstructor obj9 = new OverloadConstructor("Valla",34,"A100");
         OverloadConstructor obj10 = new OverloadConstructor("Valla");
        break;
            }
              case 9:{
                  Enum obj11[] = Enum.values();
                  for(Enum en:obj11){
                      System.out.println("The color of "+en+" is "+en.getColor());
                  
         }
        break;
            }
               case 10:{
         TextFile obj12 = new TextFile();
        break;
            }
        }
    }
    
}
   
