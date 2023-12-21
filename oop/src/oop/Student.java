/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author NV_User
 */
public class Student {
    private 
    int id;
    String firstname;
    String secondname;
    public 
            void setfirstname(String fistname){
                 this.firstname=fistname;
            }
            String getfirstname()
            {
                return firstname;
            }
            void setsecondname(String secondname){
                 this.secondname=secondname;
            }
            String getsecondname()
            {
                return secondname;
            }
            void setnumber(int id){
                this.id=id;
            }
            int getnumber(){
                return id;
            }
            String getfullname(){
                return getfirstname()+" "+ getsecondname();
            }
}
