package model.dao;

import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Categoria;

//DAO('Data Acess Object')
//    CRUD (acrónimo de Create, Read, Update e Delete na língua Inglesa)
//     para as quatro operações básicas utilizadas em bases de 
//     dados relacionais (RDBMS) ou em interface para utilizadores
//     para criação, consulta, atualização e destruição de dados.
public class CategoriasDAO {

    private Connection con = null;

    public CategoriasDAO() { // construtor
        con = Conexao.Criar_conexao(); //abre uma conexao com o servidor.
    }

    public boolean CRUD_salvar(Categoria categoria) {
        String sql = "INSERT INTO categoria (id_categoria,nome_categoria) VALUES (?,?)"; // codigo em sql de enserir algo no banco de dados.
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoria.getId_categoria());
            stmt.setString(2, categoria.getNome_categoria());
            stmt.executeUpdate(); //INSERT UPDATE
            JOptionPane.showMessageDialog(null, "Salvo!");
            return true; // se tudo de certo retorne verdadeiro.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            return false; // se der errado returne falso.
        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.
        }
    }

    public List<Categoria> CRUD_busca() { // buscar no banco de dados ver o que tem na tabela categorias
        con = Conexao.Criar_conexao();
        String sql = ("SELECT * FROM categoria");
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> todas_categorias = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Categoria c = new Categoria();

                c.setId_categoria(rs.getInt("id_categoria"));
                c.setNome_categoria(rs.getString("nome_categoria"));

                todas_categorias.add(c);

            }
        } catch (SQLException ex) {
            System.out.println("Erro!!!!!!!!!!!" + ex);
        } finally {
            Conexao.Fechar_conexao(con, stmt, rs);
        }
        return todas_categorias;

    }

    public boolean CRUD_alterar(Categoria categoria) {
        con = Conexao.Criar_conexao();
        String sql = "UPDATE categoria SET nome_categoria = ? WHERE id_categoria = ?"; // codigo em sql de alterar algo no banco de dados.
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getNome_categoria());
            stmt.setInt(2, categoria.getId_categoria());

            stmt.executeUpdate(); //INSERT UPDATE

            JOptionPane.showMessageDialog(null, "Alterado!");
            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!");
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }

    public boolean CRUD_excluir(Categoria categoria) {
        con = Conexao.Criar_conexao();
        String sql = "DELETE FROM categoria WHERE id_categoria = ?"; // codigo em sql que apaga algo no banco de dados.
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoria.getId_categoria());

            stmt.executeUpdate(); //INSERT UPDATE

            JOptionPane.showMessageDialog(null, "Excluido!");
            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }
}
