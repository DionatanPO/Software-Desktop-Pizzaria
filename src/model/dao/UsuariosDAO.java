package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Usuario;

//DAO('Data Acess Object')
//    CRUD (acrónimo de Create, Read, Update e Delete na língua Inglesa)
//     para as quatro operações básicas utilizadas em bases de 
//     dados relacionais (RDBMS) ou em interface para utilizadores
//     para criação, consulta, atualização e destruição de dados.
public class UsuariosDAO {

    private Connection con = null;

    public UsuariosDAO() { // construtor
        con = Conexao.Criar_conexao(); //abre uma conexao com o servidor.
    }

    public boolean CRUD_salvar_usuario(Usuario usuario) {

        String sql = "INSERT INTO usuario (nome_usuario,password,email) VALUES (?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getNome_usuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastrado! Agora basta entrar com seu email e senha!");

            return true;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salva usuario");
            ex.printStackTrace();
            return false;

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }

    public boolean CRUD_altera_usuario(Usuario usuario) {

        con = Conexao.Criar_conexao();

        String sql1 = "UPDATE usuario SET nome_usuario = ? WHERE id_usuario = ?";


        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql1);
            stmt.setString(1, usuario.getNome_usuario());
            stmt.setInt(2, usuario.getId_usuario());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario alterado!");

            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Al aterar dados");
            ex.printStackTrace();
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }

    public void receber_tabela(DefaultTableModel modelo) {

        con = Conexao.Criar_conexao();
        String sql = ("select * from usuario u inner join cliente c on u.id_usuario = c.id_cliente");
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                Cliente cliente = new Cliente();

                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome_usuario(rs.getString("nome_usuario"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));

                modelo.addRow(new Object[]{
                    usuario.getId_usuario(),
                    usuario.getNome_usuario(),
                    cliente.getTelefone(),
                    cliente.getCidade(),
                    cliente.getEstado()
                });

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar dados de usuarios e clientes" + ex);
            ex.printStackTrace();
        } finally {
            Conexao.Fechar_conexao(con, stmt, rs);
        }

    }


    public boolean CRUD_excluir_usuario(Usuario usuario) {

        String sql = "DELETE FROM usuario WHERE id_usuario = ?"; // codigo em sql que apaga algo no banco de dados.


        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getId_usuario());

            stmt.executeUpdate(); //INSERT UPDATE

            JOptionPane.showMessageDialog(null, "usuario excluido!");

            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
            ex.printStackTrace();
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }

}
