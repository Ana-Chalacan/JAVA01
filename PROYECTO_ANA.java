/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_ana;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class PROYECTO_ANA {

    public static void main(String[] args) {
        //Calcular el area del triangulo y area de circulo//
        //TRIANGULO
        double base;
        double altura;
        double respuesta;
        
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Ingresar base del traingulo:");
        base = Input.nextDouble();
        
        System.out.println("Ingresar la altura del triangulo:");
        altura = Input.nextDouble();
        
        respuesta = (base * altura)/2;
        
        System.out.println("El area del triangulo es:" +respuesta);
        
        System.out.println("***************************************");
        
        //CIRCULO
        double radio;
        
        System.out.println("Ingresar radio del circulo: ");
        radio = Input.nextDouble();
        
        respuesta = (radio*radio*3.1416);
        
        System.out.println("El area del circulo es: "+respuesta);
        
        
    }
}
