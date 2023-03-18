package com.diegofula.ejercicio22;

import java.util.Scanner;

public class ejercicio22 {
        
    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite el nombre del empleado");
        String name = scan.nextLine();
        
        System.out.println("Digite el salario por hora");
        double salh = scan.nextDouble();
        
        System.out.println("Digite la cantidad de horas");
        double chr = scan.nextDouble();
        
        double salm = salh * chr;
        
        if (salm > 450000) {
            System.out.println("Nombre del empleado:\t" + name);
            System.out.println("Salario mensual:\t" + salm);
        }else{
            System.out.println("Nombre del empleado:\t" + name);
        }
        
    }
    
}
