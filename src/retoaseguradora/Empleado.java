
package retoaseguradora;

public class Empleado {
    
    private int id;
    private String nombre;
    private int salario;   

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
     
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    public static void add(Empleado empleado) {
    }
    
    
}
