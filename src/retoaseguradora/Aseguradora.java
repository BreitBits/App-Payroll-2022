
package retoaseguradora;


import java.util.ArrayList;

public class Aseguradora{

    public ArrayList<Empleado> empleados = new ArrayList<>();
    
    public Aseguradora(Empleado empleados) {
        
      
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    public static double totalPagosOtorgadosAlEmpleado ( Empleado empleado, int diasTrabajados){
        
        
        double totalPago =  
        Aseguradora.liquidarPrestaciones(empleado,diasTrabajados)
       +Aseguradora.liquidarNomina(empleado, diasTrabajados);
       
        return totalPago;
    }
    

    public static double liquidarPrestaciones(Empleado empleado, int diasTrabajados){
        
         if (empleado.getSalario() > (908526*2))
        {

        return ((empleado.getSalario()*diasTrabajados/360)
                +(empleado.getSalario()*diasTrabajados/360)
                +((empleado.getSalario()*diasTrabajados/360)*0.12)
                +((empleado.getSalario()*diasTrabajados/720)));

        } 

        else 
        {

        return ((((empleado.getSalario()+106454)*diasTrabajados/360)
                +((empleado.getSalario()+106454)*diasTrabajados/360)
                +(((empleado.getSalario()+106454)*diasTrabajados/360)*0.12)
                +(((empleado.getSalario())*diasTrabajados/720))));// no se incluye auxilio de transporte para el calculo de vacaciones

        }
    }
        

     public static double liquidarSegSocial(Empleado empleado, int diasTrabajados){
         
           return ((empleado.getSalario()*diasTrabajados/30*0.085)+
                   (empleado.getSalario()*diasTrabajados/30*0.12)
                   +(empleado.getSalario()*diasTrabajados/30*0.00522));
     }
     
     public static double liquidarNomina(Empleado empleado, int diasTrabajados){
      
        int auxilioTransporte = 0;
        double totalNomina =0;
        if(empleado.getSalario() <= (908526*2)) {
           auxilioTransporte = 106454;

        }
        totalNomina = empleado.getSalario() * 0.92;
        if(empleado.getSalario() <= (908526*2)){
            totalNomina += auxilioTransporte;
        }
        return (totalNomina/30)*diasTrabajados;
    }

    public static double liquidarParafiscales(Empleado empleado, int diasTrabajados){

       
        double aporteCaja = ((empleado.getSalario()*0.04)/30)*diasTrabajados;
        double aporteIcbf = ((empleado.getSalario()*0.03)/30)*diasTrabajados;
        double aporteSena = ((empleado.getSalario()*0.02)/30)*diasTrabajados;
        double totalParafiscales = aporteCaja + aporteIcbf + aporteSena;
        return totalParafiscales;

    }
 }
