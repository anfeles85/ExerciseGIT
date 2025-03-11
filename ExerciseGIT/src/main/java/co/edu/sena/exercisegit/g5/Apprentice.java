/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exercisegit.g5;

/**
 *
 * @author anfeles
 */
public class Apprentice {
    private String fullname;
    private int age;
    private long phone;
    
    public Apprentice() {
    }

    public Apprentice(String fullname, int age, long phone) {
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return fullname ;
    }
}
