/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exercisegit.g1;

/**
 *
 * @author anfeles
 */
public class Apprentice {

    private String fullname;
    private int age;
    private int phone;
    
    public Apprentice() {
    }

    public Apprentice(String fulname, int age, int phone) {
        this.fullname = fulname;
        this.age = age;
        this.phone = phone;
    }

    public String getFulname() {
        return fullname;
    }

    public void setFulname(String fulname) {
        this.fullname = fulname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return fullname;
    }
    
    
    
    
}
