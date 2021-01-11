package com.company;

import clases.CapacidadEndedudamiento;

import java.util.Scanner;

public class Main {
	
	public static Integer ingMensuales = 0;
	public static Integer gastosFijos = 0;
	public static Integer gastosVaribales = 0;
	public static String entrada1 = "";
	public static String entrada = "";
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);
        // clase scanner PUNTO 2: Scanner es una clase en el paquete java.util utilizada para obtener la 
        //entrada de los tipos primitivos como int, double etc. y también String


        System.out.println("Ingrese sus ingresos mensuales");

        String entrada = "SI";
        while (entrada.equals("SI")) {
          	System.out.println("Desea Calcular su capacidad de endeudamiento SI/NO?: ");
            String valor = in.next().toUpperCase(); // vuelve la respuesta Mayúscula
            if (valor.equals("SI")) {
            	//try {
                System.out.println("Ingrese el valor de sus ingresos mensuales: ");
                Integer ingMensuales = in.nextInt();
                if (ingMensuales > 0) {
                    System.out.println("Ingrese el valor de sus gastos fijos: ");
                    Integer gastosFijos = in.nextInt();
                    if (gastosFijos > 0) {
                        System.out.println("Ingrese el valor de sus gastos variables: ");
                        Integer gastosVaribales = in.nextInt();
                        if (gastosVaribales >0) {
                        	//Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
                            // CapacidadEndedudamiento()
                            CapacidadEndedudamiento endeudamiento = new CapacidadEndedudamiento(ingMensuales, gastosFijos, gastosVaribales);
                            System.out.println(endeudamiento.getCapacidadEndeudamiento(ingMensuales, gastosFijos, gastosVaribales));
                            continue;
                            //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
                            //Utiliza el metodo is numeric para cada entrada de ser necesarios
                        } else {
                            System.out.println("valor inválido de Gastos Variables");
                            break;
                        }
                    } else {
                        System.out.println("valor inválido de Gastos fijos");
                        break;
                    }
                } else {
                    System.out.println("valor inválido de Ingresos mensuales");
                    break;
                }
            	
            } else {
                entrada = "NO";
                System.out.println("Muchas gracias por usar el simulador");
            }
        		
    }
            
            
        }
    
public static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
}


/* if (Main.isNumeric(ingMensuales)){
System.out.println(ingMensuales + " es un numero");
}else { System.out.println(ingMensuales + " NO es un numero");}*/