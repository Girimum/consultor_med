package modeloDao;

import modeloConection.conexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.Beans;

public class DaoMedico {    
        conexaoBD conex = new conexaoBD();
        //BeansMed mod = new BeansMed();
     
    public void Salvar(Beans mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos (crm, nome, cpf, rg, telefone, endereco, sexo, senha) values(?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setInt(1, mod.getCrm());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getCpf ());
            pst.setString(4, mod.getRg ());
            pst.setString(5, mod.getTelefone());
            pst.setString(6, mod.getEndereco ());
            pst.setString(7, mod.getSexo ());
            pst.setString(8, mod.getSenha ());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Successo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados!/nErro"+ex);
        }
         conex.desconectar();
    }
    public void Editar(Beans mod){
        conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("UPDATE medicos set crm=?, nome=?, cpf=?, rg=?, telefone=?, endereco=?, sexo=?, senha=? where cod_med=?");
                pst.setInt(1, mod.getCrm());
                pst.setString(2, mod.getNome());
                pst.setString(3, mod.getCpf ());
                pst.setString(4, mod.getRg ());
                pst.setString(5, mod.getTelefone());
                pst.setString(6, mod.getEndereco ());
                pst.setString(7, mod.getSexo ());
                pst.setString(8, mod.getSenha ());
                pst.setInt(9, mod.getCod_med());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na Alteração de informações do Médico!/nErro"+ex);
            }
        conex.desconectar();
    }
    
    public void Excluir (Beans mod){
        conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("DELETE from medicos where cod_med=?");
                pst.setInt(1, mod.getCod_med());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir as informações do Médico!/nErro"+ex);
            }
    }
    
    public Beans buscaMedico(Beans mod){
        conex.conexao();
        conex.executaSQL("select * from medicos where nome like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCod_med(conex.rs.getInt("cod_med"));
            mod.setCrm(conex.rs.getInt("crm"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setRg(conex.rs.getString("rg"));
            mod.setTelefone(conex.rs.getString("telefone"));
            mod.setEndereco(conex.rs.getString("endereco"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setSenha(conex.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Médico!/nErro"+ex);
        }
        conex.desconectar();
        
        return mod;
    }
    
}
