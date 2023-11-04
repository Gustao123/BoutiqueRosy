    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juriel
 */
public class cliente {
    private int id_cliente;
    private String client_nombre;
    private String client_apellido;
    private String direccion;
    private String telefono;
    private String correo_electronico;
    private String categoria;

    public cliente(int id_cliente, String client_nombre, String client_apellido, String direccion, String telefono, String correo_electronico, String categoria) {
        this.id_cliente = id_cliente;
        this.client_nombre = client_nombre;
        this.client_apellido = client_apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.categoria = categoria;
    }

    public cliente(String client_nombre, String client_apellido, String direccion, String telefono, String correo_electronico, String categoria) {
        this.client_nombre = client_nombre;
        this.client_apellido = client_apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.categoria = categoria;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getClient_nombre() {
        return client_nombre;
    }

    public void setClient_nombre(String client_nombre) {
        this.client_nombre = client_nombre;
    }

    public String getClient_apellido() {
        return client_apellido;
    }

    public void setClient_apellido(String client_apellido) {
        this.client_apellido = client_apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
