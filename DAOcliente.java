/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java .util.*;
/**
 *
 * @author juriel
 */
public class DAOcliente {

    private int numero;

    public DAOcliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public cliente Insertar(String client_nombre, String client_apellido, String direccion, String correo_electronico,
            String categoria, String telefono){
        String id_clientes = null;
        
        
       
      String  transaccion = "INSERTA INTO cliente(client_nombre, client_apellido,  dirreccion,numero,correo_electronico,categoria) VALUES('"
                + id_clientes + "','"
                + client_nombre + "', '"
                + client_apellido + "', '"
                + direccion + "', '"
                + telefono + "','"
                + correo_electronico + "','"
                + categoria + "')";
              
                 
                if(new DataBase().Actualizar(transaccion) >0) {
                    return new cliente (client_nombre, client_apellido, direccion, telefono , correo_electronico, categoria );
                }     
              return null;  
    }
      public int Actualizar(int id_cliente, String client_nombre, String client_apellido, 
            String direccion, int telefono, String correo_electronico, String categoria) {

        String transaccion = "UPDATE cliente SET client_nombre='"
                + client_nombre + "', client_apellido='"
                + client_apellido + "', correo_electronico= '"
                + correo_electronico + "', direccion='"
                + direccion + "', categoria= '"
                + categoria + "', numero="
                +numero+"WHERE id_client="
                +id_cliente;

        return new DataBase().Actualizar(transaccion);
    }
      public List obtenerDatos() {
          String transaccion="SELECT*FROM cliente";
          List<Map> registros=new DataBase().listar(transaccion);
          List<cliente> clientes=new ArrayList<>();
          
          for (Map registro : registros){
                cliente aut=new cliente((int) registro.get("id_cliente"),
                        (String) registro.get("nombre"),
                         (String) registro.get("apellido"),
                         (String) registro.get("direccion"),
                         (String) registro.get("telefono "),
                         (String) registro.get("correo"),
                         (String) registro.get("categoria"));
                clientes.add(aut);
          }
          return clientes;
      }
      public int  Eliminar(int id){
          String transaccion= "DELETE FROM cliente WHERE id_cliente='"+id +"'";
          return new  DataBase().Actualizar(transaccion);
      }

     
    }

   
    
    
   
        

    

  