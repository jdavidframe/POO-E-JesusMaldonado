package taller5poo;
import java.util.Scanner;

public class Problema_3_Ejecutor {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        String nombreEmpresa, ruc, direccion, nombreDep;
        int n, numEmp;
        double prod;
        Problema_3_Departamento [] dep;
        
        System.out.println("------------------------------");
        System.out.println("Ingrese nombre de la empresa:");
        nombreEmpresa = e.nextLine();
        System.out.println("Ingrese el RUC:");
        ruc = e.nextLine();
        System.out.println("Ingrese la direccion:");
        direccion = e.nextLine();
        
        System.out.println("Ingrese la cantidad de departamentos:");
        n = e.nextInt();
        dep = new Problema_3_Departamento [n];
        
        e.nextLine(); 
        
        for (int i = 0; i < dep.length; i++) {
            System.out.println("Ingrese el nombre del departamento " + (i+1) + ":");
            nombreDep = e.nextLine();
            System.out.println("Ingrese el numero de empleados:");
            numEmp = e.nextInt();
            System.out.println("Ingrese la produccion anual:");
            prod = e.nextDouble();
            e.nextLine(); 
            
            Problema_3_Departamento dt = new Problema_3_Departamento(nombreDep,
                    numEmp, prod);
            
            dt.calcularCategoria();
            dep[i] = dt;
        }
        
        Problema_3_Empresa emp = new Problema_3_Empresa(nombreEmpresa, ruc,
                direccion, dep);
        
        System.out.println("------------------------------");
        System.out.println("       REPORTE FINAL");
        System.out.println(emp.toString());
        System.out.println("------------------------------");
    }
}
    

