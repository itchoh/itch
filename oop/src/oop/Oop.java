/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.util.Scanner;
public class Oop {
    public static void main(String[] args) {
    Student stu=new Student();
     Scanner in = new Scanner(System.in);
     String n1=in.next();
     String n2=in.next();
    stu.setfirstname(n1);
    stu.setsecondname(n2);
    int num=in.nextInt();
    stu.setnumber(num);
        System.out.println("num "+stu.getnumber()+" \n" +stu.getfullname());
    }
}

    
