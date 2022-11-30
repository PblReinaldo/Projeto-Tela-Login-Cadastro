/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import interfacelogin.MenuLogin;
import interfacelogin.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author só estudos calma
 */
public class TelaLoginController {
    
    private TelaLogin tela;

    public TelaLoginController(TelaLogin tela) {
        this.tela = tela;
    }

    public void autenticar() throws SQLException {
        //buscar um usuario
        String usuario = tela.getTxtUsuario().getText();
        String senha = tela.getTxtSenha().getText();
        Usuario usuarioaAutenticar = new Usuario(usuario, senha);
        
        //verificar se existe no banco
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.ExisteNoBancoPorUsuarioESenha(usuarioaAutenticar);
        
        //direcionar para menu
        
        if(existe){
            MenuLogin login = new MenuLogin();
            login.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(tela, "Usuario ou senha invalidos!");
        }

    }
   
}
