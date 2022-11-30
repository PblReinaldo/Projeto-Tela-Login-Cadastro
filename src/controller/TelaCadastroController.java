/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import interfacelogin.TelaCadastro;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author só estudos calma
 */
public class TelaCadastroController {
    private final TelaCadastro tela;

    public TelaCadastroController(TelaCadastro tela) {
        this.tela = tela;
    }
    
    public void SaveUser(){
    
        String usuario1 = tela.getTxtUsuarioCd().getText();
        String senha1 = tela.getTxtSenhaCd().getText();
        
        Usuario usuario = new Usuario(usuario1, senha1);
        
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
