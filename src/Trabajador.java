 
import java.util.ArrayList;
import java.util.List;
 
public class Trabajador {
 
    private String nombre;
    private int codigo;
    private int salario;
     
    public Trabajador(int id, String name, int sal){
        this.codigo = id;
        this.nombre = name;
        this.salario = sal;
    }
     
    public boolean equals(Object obj){
        Trabajador emp = (Trabajador) obj;
        boolean status = false;
        if(this.nombre.equalsIgnoreCase(emp.nombre)
                && this.codigo == emp.codigo 
                && this.salario == emp.salario){
            status = true;
        }
        return status;
    }
     
    public static String getNombreTrabjadorMayorSalario(){
        
    	
        return "Nattu";
    }
     
    public static Trabajador getTrabajadorMayorSalario(){
      
    	
        return new Trabajador(1, "Nattu", 15000);
    }
     
    public int hashCode(){
        return this.codigo;
    }
     
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

	
}