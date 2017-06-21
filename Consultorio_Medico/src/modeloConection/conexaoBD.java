package modeloConection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.swing.JOptionPane;

public class conexaoBD {
    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost:5432/postgres";//localhost:5432
    private final String usuario = "postgres"; 
    private final String senha = "admin"; 
    public Connection con;


public void conexao(){
    
       try {
           //System.setProperty("jdbc.Drivers", driver);
           con = DriverManager.getConnection(caminho, usuario, senha);
           JOptionPane.showMessageDialog(null,"Conexão efetuada com Sucesso ");
                   
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO ao se conectar com o Banco de Dados:/n " + ex.getMessage());
       }
 
}

public void executaSQL(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO ao ExecutaSql:/n " + ex.getMessage());
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
