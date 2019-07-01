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
public class alumno1 extends Persona {
     private double Calificacion;

    public alumno1(double Calificacion, String ci, String Nombres, String apellidos, String email, String telefono) {
        super(ci, Nombres, apellidos, email, telefono);
        this.Calificacion = Calificacion;
    }

    

    public double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(double Calificacion) {
        this.Calificacion = Calificacion;
    }

     public void ConsultaCalificacion(){
        System.out.println("Calificacion: "+this.Calificacion);
    }
}
