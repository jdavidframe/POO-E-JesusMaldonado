/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo;

/**
 *
 * @author jdavi
 */
public class Problema2_Estudiante {
    private String nombre;
    private int edad;
    private Problema2_Materia[] listaMaterias;
    private int contadorMaterias;

    public Problema2_Estudiante(String nombre, int edad, int maxMaterias) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaMaterias = new Problema2_Materia[maxMaterias];
        this.contadorMaterias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMateria(Problema2_Materia materia) {
        if (contadorMaterias < listaMaterias.length) {
            listaMaterias[contadorMaterias] = materia;
            contadorMaterias++;
        } else {
            System.out.println("No se pueden agregar más materias para " + nombre);
        }
    }

    public void verificarAprobacion() {
        System.out.println("Estudiante: " + nombre + " (Edad: " + edad + ")");
        if (contadorMaterias == 0) {
            System.out.println("Estado: Sin materias registradas.");
            System.out.println("---------------------------------------");
            return;
        }

        for (int i = 0; i < contadorMaterias; i++) {
            Problema2_Materia mat = listaMaterias[i];
            double notaFinal = mat.getAcd() + mat.getApe() + mat.getAa();
            
            System.out.println("  -> Materia: " + mat.getNombre());
            System.out.println("     Nota acumulada: " + notaFinal + " / 10.0");

            if (notaFinal >= 7.0) {
                System.out.println("     Estado: APROBADO");
            } else {
                System.out.println("     Estado: REPROBADO");
                double acumulado60 = notaFinal * 0.60;
                System.out.printf("     Deberá rendir examen de recuperación sobre 3.5 pts.%n");
                System.out.printf("     Base 60%% acumulado: %.2f pts.%n", acumulado60);
            }
        }
        System.out.println("---------------------------------------");
    }
}
