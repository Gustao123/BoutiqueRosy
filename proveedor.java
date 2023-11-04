/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juriel
 */
public class proveedor {
  private String id_proveerdor;
  
private String company;
private String telefono;
private String correo;

    public proveedor(String id_proveerdor, String company, String telefono, String correo) {
        this.id_proveerdor = id_proveerdor;
        this.company = company;
        this.telefono = telefono;
        this.correo = correo;
    }

    public proveedor(String company, String telefono, String correo) {
        this.company = company;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getId_proveerdor() {
        return id_proveerdor;
    }

    public void setId_proveerdor(String id_proveerdor) {
        this.id_proveerdor = id_proveerdor;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}