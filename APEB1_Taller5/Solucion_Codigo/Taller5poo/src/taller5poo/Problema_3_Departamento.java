
package taller5poo;


public class Problema_3_Departamento {
    private String nombre;
    private int numeroEmpleados;
    private double produccionAnual;
    private char categoria;


    public Problema_3_Departamento(String nombre, int numeroEmpleados, 
            double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public double getProduccionAnual() {
        return produccionAnual;
    }

    public void setProduccionAnual(double produccionAnual) {
        this.produccionAnual = produccionAnual;
    }

    public char getCategoria() {
        return categoria;
    }

    public void calcularCategoria() {
        if (numeroEmpleados == 10 && produccionAnual == 500000) {
            categoria = 'C';
        } else if (numeroEmpleados == 20 && produccionAnual == 1000000) {
            categoria = 'B';
        } else if(numeroEmpleados > 20 && produccionAnual > 1000000){
            categoria = 'A';
        }else{
            categoria = '-';
                
                }
    }


    public String toString() {
        return "Departamento: " + nombre + " | Empleados: " + numeroEmpleados + 
               " | Produccion: $" + produccionAnual + " | CATEGORIA: " + categoria;
    }
}
    

