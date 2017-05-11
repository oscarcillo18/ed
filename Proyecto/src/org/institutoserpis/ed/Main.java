package org.institutoserpis.ed;

import java.util.*;

public class Main {

    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("¿Qué día es hoy?");
        System.out.println("------------------------");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        System.out.println("8. Finalizar");

        System.out.print("Elija la opcion (del 1 al 8):");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado Lunes");
                Scanner HoraLunes = new Scanner(System.in);
                double Lunes;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Lunes = entrada.nextDouble(); 
                if (Lunes >= 8 && Lunes <= 14)
        			System.out.println("Deberías estar en clase");
                else
        		{
        		System.out.println("¡Estás en tu tiempo libre!");}
        		break;
            case 2:
            	System.out.println("Ha seleccionado Martes");
                Scanner HoraMartes = new Scanner(System.in);
                double Martes;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Martes = entrada.nextDouble();
                if (Martes >= 8 && Martes <= 14)
        			System.out.println("Deberías estar en clase");
                else
        		{
        		System.out.println("¡Estás en tu tiempo libre!");}
                break;
            case 3:
            	System.out.println("Ha seleccionado Miercoles");
                Scanner HoraMiercoles = new Scanner(System.in);
                double Miercoles;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Miercoles = entrada.nextDouble();  
                if (Miercoles >= 8 && Miercoles <= 14)
        			System.out.println("Deberías estar en clase");
                else
        		{
        		System.out.println("¡Estás en tu tiempo libre!");}
                break;
            case 4:
            	System.out.println("Ha seleccionado Jueves");
                Scanner HoraJueves = new Scanner(System.in);
                double Jueves;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Jueves = entrada.nextDouble();           
                if (Jueves >= 8 && Jueves <= 14)
        			System.out.println("Deberías estar en clase");
                else
        		{
        		System.out.println("¡Estás en tu tiempo libre!");}
                break;
            case 5:
            	System.out.println("Ha seleccionado Viernes");
                Scanner HoraViernes = new Scanner(System.in);
                double Viernes;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Viernes = entrada.nextDouble();     
                if (Viernes >= 8 && Viernes <= 14)
        			System.out.println("Deberías estar en clase");
                else
        		{
        		System.out.println("¡Estás en tu tiempo libre!");}
                break;
            case 6:
            	System.out.println("Ha seleccionado Sabado");
                Scanner HoraSabado = new Scanner(System.in);
                double Sabado;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Sabado = entrada.nextDouble(); 
        		System.out.println("¡Da igual la hora que sea, disfruta del finde!");                              
                break;
            case 7:
            	System.out.println("Ha seleccionado Domingo");
                Scanner HoraDomingo = new Scanner(System.in);
                double Domingo;
                System.out.println("¿Qué hora es? (Ponga una hora del 00,00 al 23,59 con una coma (,) de por medio entre la hora y los minutos)");
                Domingo = entrada.nextDouble(); 
                System.out.println("¡Da igual la hora que sea, disfruta del finde!"); 
                break;
            default:
                System.out.println("Ha finalizado el programa." +
                		"");
        }
    }
}