/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Futbolista {
    
    private String cedula, nombre;
    private double estatura;
    private int edad;
    private String fechaNacimiento;

    public Futbolista() {
    }
    public Futbolista(String cedula, String nombre, double estatura, int edad, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}