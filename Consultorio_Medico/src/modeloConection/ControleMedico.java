
package modeloConection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modeloMed;

 class ControleMedico {    
    conexaoBD conex = new conexaoBD();
     modeloMed modd = new modeloMed();
     
     public void Salvar(modeloMed mod){
         conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCpf ());
            pst.setInt(3, mod.getRg ());
            pst.setInt(4, mod.getCrm());
            pst.setString(5, mod.getTelefone ());
            pst.setString(6, mod.getEndereco ());
        } catch (SQLException ex) {
            Logger.getLogger(ControleMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
         conex.desconectar();
     }
    
}
