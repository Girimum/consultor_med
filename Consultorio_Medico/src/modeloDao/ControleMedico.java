package modeloDao;




import modeloConection.conexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansMed;

public class ControleMedico {    
        conexaoBD conex = new conexaoBD();
        //BeansMed mod = new BeansMed();
     
    public void Salvar(BeansMed mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos (nome, cpf, rg, telefone, endereco, sexo, senha) values(?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf ());
            pst.setString(3, mod.getRg ());
            pst.setString(4, mod.getTelefone());
            pst.setString(5, mod.getEndereco ());
            pst.setString(6, mod.getSexo ());
            pst.setString(7, mod.getSenha ());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Successo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao DEU ERROOOOOOO Inseridos Dados!/nErro"+ex);
        }
         conex.desconectar();
     }
    
}
