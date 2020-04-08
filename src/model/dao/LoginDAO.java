package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class LoginDAO {

    private Connection con = null;
    
    public LoginDAO() {
        con = Conexao.Criar_conexao();
    }
   

    public boolean CRUD_busca(Usuario usuario) { // buscar no banco de dados ver o que tem na tabela users
      
        con = Conexao.Criar_conexao();

        String sql = ("SELECT * FROM usuario WHERE email = ? and password = ?");
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean resultado = false;

        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getPassword());

            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Usuario cadastrado no banco de dados");
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Email não encontrado ou senha errada");
                resultado = false;
            }

        } catch (SQLException ex) {
            System.out.println("Erro!!!!!" + ex);
        } finally {
            Conexao.Fechar_conexao(con, stmt, rs);
        }
        return resultado;

    }
}
