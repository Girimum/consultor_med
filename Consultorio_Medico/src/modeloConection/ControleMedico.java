
package modeloConection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.modeloMed;

public class ControleMedico {    
        conexaoBD conex = new conexaoBD();
        modeloMed mod = new modeloMed();
     
    public void Salvar(modeloMed mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos nome, cpf, rg, telefone, endereco, sexo, senha");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCpf ());
            pst.setInt(3, mod.getRg ());
            pst.setString(4, mod.getTelefone());
            pst.setString(5, mod.getEndereco ());
            pst.setString(6, mod.getSexo ());
            pst.setString(7, mod.getSenha ());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Successo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao  Inseridos Dados!/nErro"+ex);
        }
         conex.desconectar();
     }
    
}
