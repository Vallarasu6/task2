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
import java.io.FileWriter;
import java.io.IOException;
public class TextFile {
    TextFile(){
        try{
            FileWriter file = new FileWriter("C:\\Users\\Dell\\Desktop\\task2\\Sample.txt");
            file.write(String.format("Programmatically created file%n"));
           
            file.write(String.format("Thise words were written programmitically%n"));
            file.write(String.format("Life is very short Nanba! Always be happy!"));
            file.close();
            System.out.println("File successfully created!");
        }
        catch(Exception e){
            System.out.println("Some error is occured!!");
            e.printStackTrace();
        }
    }
}
