/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import jabaBeans.Categoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabri
 */
public class Categoriacad {
    public static ArrayList<Categoria> listar(){
        try {
            String sql="{call sp_listarCategoriaSuperior()}";
            Connection c=Conexion.conectar();
            com.mysql.jdbc.CallableStatement sentencia=(com.mysql.jdbc.CallableStatement) c.prepareCall(sql);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while (resultado.next()) {  
                Categoria cat=new Categoria();
                cat.setCodigo(resultado.getInt("codigo"));
                  cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
                
            }
            return lista;
        } catch (SQLException ex) {
           return null; 
        }
    }
     public static ArrayList<Categoria> listarsubCategoria(int catSuperior){
        try {
            String sql="{call sp_listarsubCategoria(?)}";
            Connection c=Conexion.conectar();
            CallableStatement sentencia=(CallableStatement) c.prepareCall(sql);
            sentencia.setInt(1, catSuperior);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while (resultado.next()) {  
                Categoria cat=new Categoria();
                cat.setCodigo(resultado.getInt("codigo"));
                  cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
                
            }
            return lista;
        } catch (SQLException ex) {
           return null; 
        
        }
     }


      public static boolean esSuperior(int cat){
        try {
            String sql="{call sp_contarsubCategoria(?)}";
            Connection c=Conexion.conectar();
            CallableStatement sentencia=(CallableStatement) c.prepareCall(sql);
            sentencia.setInt(1, cat);
            ResultSet resultado=sentencia.executeQuery();
             resultado.next();
            return resultado.getInt("cantidad")>0;
        } catch (SQLException ex) {
           return false; 
        }
      }
           
            public static ArrayList<Categoria> listarTodoDeCategorias(){
        try {
            String sql="{call sp_listartododecategoria())}";
            Connection c=Conexion.conectar();
            CallableStatement sentencia=(CallableStatement) c.prepareCall(sql);
            //sentencia.setInt(1, catSuperior);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while (resultado.next()) {  
                Categoria cat=new Categoria();
                cat.setCodigo(resultado.getInt("codigo"));
                  cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
                
            }
            return lista;
        } catch (SQLException ex) {
           return null; 
        }
      }
}