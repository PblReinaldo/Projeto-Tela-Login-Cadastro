/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfacelogin.TelaCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;
import java.sql.ResultSet;
/**
 *
 * @author só estudos calma
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{

            String sql = "insert into \"USER\"(usuario, senha) values('" + usuario.getUsuario()+ "', '"+ usuario.getSenha()+"'); ";
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute();
            
    }

    public boolean ExisteNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
        
        String sql = "select * from \"USER\" where usuario = '" + usuario.getUsuario()+ "' and senha = '"+ usuario.getSenha()+"'";
        PreparedStatement st = connection.prepareStatement(sql);
        st.execute();
        
        ResultSet resultSet =  st.getResultSet();
        
        /*if(resultSet.next()){
            return  true;
        } else{
            return false;
        }*/
        
        return resultSet.next();
    }
}
