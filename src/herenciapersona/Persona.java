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
public class Persona {
      private String ci;
    private String Nombres;
    private String apellidos;
    private String email;
    private String telefono;

    public Persona(String ci, String Nombres, String apellidos, String email, String telefono) {
        this.ci = ci;
        this.Nombres = Nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void ImprimirDatos(){
        System.out.println("Cedula: "+this.ci+" , Nombres: "+this.Nombres+" , Apellidos: "+this.apellidos+" , Email:"+this.email+" , Telefono: "+this.telefono);
    }
}
