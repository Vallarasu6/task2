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
public class PojoClass {
    PojoClass(){
        
    }
private String name;  
private String id;  
private double sal;
private int rollnum;
private String role;
public String getName(){
    return name;
}
public void setName(String name){
  this.name=name;
}
public String getId(){
    return id;
}
public void setId(String id){
  this.id=id;
}
public double getSal(){
    return sal;
}
public void setSal(double sal){
  this.sal=sal;
}
public int getRollnum(){
    return rollnum;
}
public void setRollnum(int rollnum){
  this.rollnum=rollnum;
}
public String getRole(){
    return role;
}
public void setRole(String role){
  this.role=role;
}
}