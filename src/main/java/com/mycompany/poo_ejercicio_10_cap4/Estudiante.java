/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_ejercicio_10_cap4;

/**
 *
 * @author Luis F Montoya
 */
public class Estudiante {
    String Nombre;
    int Estrato,NumeroInscripcion;
    double Patrimonio,PagoMatricula=50000;

    public Estudiante(int NumeroInscripcion, String Nombre, int Estrato, double Patrimonio) {
        this.NumeroInscripcion = NumeroInscripcion;
        this.Nombre = Nombre;
        this.Estrato = Estrato;
        this.Patrimonio = Patrimonio;
    }
    
    public void CalcularPago(){
        if(Estrato > 3 && Patrimonio > 2000000)
            PagoMatricula += (Patrimonio*0.03);
    }   

    @Override
    public String toString() {
        return "Estudiante\nNumeroInscripcion: " + NumeroInscripcion + "\nNombre: " + Nombre + "\nPagoMatricula: " + PagoMatricula;
    }
    
}
