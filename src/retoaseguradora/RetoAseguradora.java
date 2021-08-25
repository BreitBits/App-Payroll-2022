
package retoaseguradora;

public class RetoAseguradora{

    public static void main(String[] args) {
        
      /*CONCEPTO NÓMINA DE 3 EMPLEADOS */
        Empleado obj = new Empleado("LUIS",1810050);
        Empleado obj1 = new Empleado("LUISA",2500000);
        Empleado obj2 = new Empleado("JAIR",3000000);

        
        /*EMPLEADO 3 */
        System.out.println("Conceptos de nómina de LUIS");
        System.out.println("Prestaciones : "+ Aseguradora.liquidarPrestaciones(obj1, 152));
        System.out.println("Seguridad: "+Aseguradora.liquidarPrestaciones(obj, 152));
        System.out.println("Nómina: "+Aseguradora.liquidarNomina(obj, 152));
        System.out.println("Parafiscales: "+Aseguradora.liquidarParafiscales(obj, 152));
        System.out.println("Pago total de nómina: " +Aseguradora.totalPagosOtorgadosAlEmpleado(obj, 152));
        
        /*EMPLEADO 2 */
        System.out.println("Conceptos de nómina de LUISA");
        System.out.println("Prestaciones : "+ Aseguradora.liquidarPrestaciones(obj1, 152));
        System.out.println("Seguridad: "+Aseguradora.liquidarSegSocial(obj1, 152));
        System.out.println("Nómina: "+Aseguradora.liquidarNomina(obj1, 152));
        System.out.println("Parafiscales: "+Aseguradora.liquidarParafiscales(obj1, 152));
         System.out.println("Pago total de nómina: " +Aseguradora.totalPagosOtorgadosAlEmpleado(obj1, 152));
         
        /*EMPLEADO 3 */
        System.out.println("Conceptos de nómina de JAIR");
        System.out.println("Prestaciones "+ Aseguradora.liquidarPrestaciones(obj2, 152));
        System.out.println("Seguridad: "+Aseguradora.liquidarSegSocial(obj2, 152));
        System.out.println("Nómina: "+Aseguradora.liquidarNomina(obj2, 152));
        System.out.println("Parafiscales: "+Aseguradora.liquidarParafiscales(obj2, 152));
        System.out.println("Pago total de nómina: " +Aseguradora.totalPagosOtorgadosAlEmpleado(obj2, 152));
 
        }
 
    }
        
        
        
    

