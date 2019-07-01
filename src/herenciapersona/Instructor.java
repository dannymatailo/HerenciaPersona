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
public class Instructor extends Persona{
    private String titulo;
    private double salario;

    public Instructor(String titulo, double salario, String ci, String Nombres, String apellidos, String email, String telefono) {
        super(ci, Nombres, apellidos, email, telefono);
        this.titulo = titulo;
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void ConsultarSalario(){
        System.out.println("Salario: "+this.salario);
    }
}
