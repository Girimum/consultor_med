package modeloConection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc.postgresql://localhost:5432/clinicaMedica";//localhost:5432
    private String usuario = "postgres"; 
    private String senha = "admin"; 
    public Connection con;


public void conexao(){
    
       try {
           System.setProperty("jdbc.Drivers", driver);
           con = DriverManager.getConnection(caminho, usuario, senha);
           JOptionPane.showMessageDialog(null,"Conexão efetuada com Sucesso ");
                   
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO ao se conectar com o Banco de Dados:/n " + ex.getMessage());
       }
 
}
public void desconectar(){
       try {
           con.close();
            JOptionPane.showMessageDialog(null," BD Desconectado com Sucesso !");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO ao fechar a conexão com BD:/n " + ex.getMessage());
       }
}
        
}
