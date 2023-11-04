    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juriel
 */
public class DAOproveedor {
    public proveedor Insertar(String id_proveedor, String company,
            String telefono, String correo){
          
        String transaccion ="INSERTA INTO proveedor( company, telefono, correo)VALUES('"
                + id_proveedor + "','"
                   + company + "', '"
                   + telefono  + "','"
                   + correo + "')";
        if(new DataBase().Actualizar(transaccion) >0) {
                    return new proveedor ( company,  telefono, correo );
                }     
              return null;  
                   
    }
    public int Actualizar(String id_proveedor , String pro_nombre, String pro_apellido, 
            String direccion, String telefono, String correo) {

        String transaccion = "UPDATE proveedor  SET client_nombre='"
                + pro_nombre + "', pro_apellido='"
                + pro_apellido + "', correo= '"
                + correo + "', direccion='"
                + direccion + "', telefono= '"
                + telefono  + "', WHERE id_client=" ;

        return new DataBase().Actualizar(transaccion);
}
     public List obtenerDatos() {
          String transaccion="SELECT*FROM proveedor";
          List<Map> registros=new DataBase().listar(transaccion);
          List<proveedor> proveedor=new ArrayList<>();
          
          for (Map registro : registros){
                proveedor aut=new proveedor((String) registro.get("id_proveedor"),
                         (String) registro.get("company"),
                         (String) registro.get("telefono "),
                         (String) registro.get("correo"));
                proveedor.add(aut);
          }
          return proveedor;
      }
      public int  Eliminar(int id){
          String transaccion= "DELETE FROM proveedor WHERE id_proveedor='"+id +"'";
          return new  DataBase().Actualizar(transaccion);
}
}