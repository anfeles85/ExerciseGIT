/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exercisegit.g2;

/**
 * objetivo: Un integrante, en el paquete de su grupo, deberá crear la clase Apprentice con los atributos fullname,
 * age y phone. Crear constructores y encapsular.
 * También deberá sobreescribir el método toString el cual retorne solamente la variable el fullname.
 * @author grupo 2
 * Fecha: 11/3/2025
 */
public class Apprentice {
    private String fullname;
    private int age;
    private int phone;

    public Apprentice(String sebastian_Rojas) {
    }

    public Apprentice(String fullname, int age, int phone) {
        this.fullname = fullname;
        this.age = age;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return fullname;
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
