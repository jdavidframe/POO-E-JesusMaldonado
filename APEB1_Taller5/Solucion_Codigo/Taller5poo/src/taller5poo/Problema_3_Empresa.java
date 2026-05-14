
package taller5poo;


public class Problema_3_Empresa {
    private String nombre;
    private String ruc;
    private String direccion;

    private Problema_3_Departamento [] d;

    public Problema_3_Empresa(String nombre, String ruc, String direccion,
            Problema_3_Departamento[] d) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.d = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Problema_3_Departamento[] getD() {
        return d;
    }

    public void setD(Problema_3_Departamento[] d) {
        this.d = d;
    }

    public String toString() {
        String reporte = "========================================\n" +
                         "Nombre: " + nombre + "\n" +
                         "RUC: " + ruc + "\n" +
                         "Direccion: " + direccion + "\n" +
                         "----------------------------------------\n" +
                         "DEPARTAMENTOS:\n";
        
        int j;
        for (j = 0; j < d.length; j++) {
            reporte = reporte + d[j].toString() + "\n";
        }
        
        return reporte;
    }
}

    
