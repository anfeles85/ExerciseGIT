/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exercisegit.g3;

/**
 * Fecha: 11/03/2025
 * @author 
 * - Lina Vannesa Salcedo Cuellar
 * - Alejandro Ocampo Saya
 * - Juan Sebastian Rodriguez Cruz
 * Descrippcion: Ejercicio de prueba con GIT
 */
public class Apprentice {
    private String fullname;
    private int age;
    private int phone;

    public Apprentice() {
    }

    public Apprentice(String fullname, int age, int phone) {
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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
        return "Apprentice" + "Nombre: " + fullname;
    }
}

