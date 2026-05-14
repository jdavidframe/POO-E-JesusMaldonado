/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Problema2_MateriaEjecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de estudiantes a registrar: ");
        int cantidadEstudiantes = entrada.nextInt();
        entrada.nextLine();

        Problema2_Estudiante[] listaEstudiantes = new Problema2_Estudiante[cantidadEstudiantes];

        for (int i = 0; i < listaEstudiantes.length; i++) {
            System.out.println("Ingrese datos del Estudiante " + (i + 1));
            System.out.print("Nombre: ");
            String nombreEst = entrada.nextLine();
            System.out.print("Edad: ");
            int edadEst = entrada.nextInt();
            System.out.print("Cantidad de Materias: ");
            int cantMaterias = entrada.nextInt();
            entrada.nextLine();

            listaEstudiantes[i] = new Problema2_Estudiante(nombreEst, edadEst, cantMaterias);

            for (int j = 0; j < cantMaterias; j++) {
                System.out.println("Materia " + (j + 1) + ":");
                System.out.print("\tIngrese el nombre de la materia: ");
                String nombreMat = entrada.nextLine();
                System.out.print(" \t\tNota ACD (Max 3.5): ");
                double acd = entrada.nextDouble();
                System.out.print("\t\tNota APE (Max 3.5): ");
                double ape = entrada.nextDouble();
                System.out.print("\t\tNota AA (Max 3.0): ");
                double aa = entrada.nextDouble();
                entrada.nextLine();

                Problema2_Materia materia = new Problema2_Materia(nombreMat, acd, ape, aa);
                listaEstudiantes[i].agregarMateria(materia);
            }
        }

        System.out.println(" REPORTE GLOBAL DE CALIFICACIONES     ");
        for (int i = 0; i < listaEstudiantes.length; i++) {
            listaEstudiantes[i].verificarAprobacion();
        }
    }
}
