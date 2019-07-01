/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;

/**
 *
 * @author labctr
 */
public class HerenciaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor instructor1=new Instructor("Licenciado",1000,"123456789","juan","perez","miemail","09885115809");
        instructor1.ImprimirDatos();
        instructor1.ConsultarSalario();
      
    }
    
}
