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
import model.Produtos;

//DAO('Data Acess Object')
//    CRUD (acrónimo de Create, Read, Update e Delete na língua Inglesa)
//     para as quatro operações básicas utilizadas em bases de 
//     dados relacionais (RDBMS) ou em interface para utilizadores
//     para criação, consulta, atualização e destruição de dados.
public class ProdutosDAO {

    private Connection con = null;

    public ProdutosDAO() { // construtor
        con = Conexao.Criar_conexao(); //abre uma conexao com o servidor.
    }

    public boolean CRUD_salvar(Produtos p) {

        String sql = "INSERT INTO produto (nome_produto,preco,categoria_fk_id) VALUES (?,?,?)"; // codigo em sql de enserir algo no banco de dados.
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, p.getNome_produto());
            stmt.setDouble(2, p.getPreco());
//            stmt.setInt(3, p.getCategoria_fk_id());
            stmt.setInt(3, p.getCategoria().getId_categoria());

            stmt.executeUpdate(); //INSERT UPDATE

            JOptionPane.showMessageDialog(null, "produto salvo");

            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto naõ salvo");
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }

    public List<Produtos> CRUD_busca() { // buscar no banco de dados ver o que tem na tabela categorias

        String sql = ("select * from produto p inner join categoria c on c.id_categoria = p.categoria_fk_id");
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> todos_produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos p = new Produtos();
                Categoria c = new Categoria();

                p.setId_produto(rs.getInt("id_produto"));
                p.setNome_produto(rs.getString("nome_produto"));
                p.setPreco(rs.getDouble("preco"));
                p.setCategoria(c);
                c.setNome_categoria(rs.getString("nome_categoria"));
                todos_produtos.add(p);

            }
        } catch (SQLException ex) {
            System.out.println("Erro na busca" + ex);
        } finally {
            Conexao.Fechar_conexao(con, stmt, rs);
        }
        return todos_produtos;

    }

    public boolean CRUD_alterar(Produtos p) {

        con = Conexao.Criar_conexao();
        String sql = "UPDATE produto SET categoria_fk_id = ? WHERE id_produto = ?"; // codigo em sql de alterar algo no banco de dados.
        String sql2 = "UPDATE produto SET nome_produto = ? , preco = ? WHERE id_produto = ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, p.getCategoria().getId_categoria());
            stmt.setInt(2, p.getId_produto());
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Categoria do produto alterada");

            stmt = con.prepareStatement(sql2);
            stmt.setString(1, p.getNome_produto());
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3, p.getId_produto());

            stmt.executeUpdate(); //INSERT UPDATE

            JOptionPane.showMessageDialog(null, "Dados do produto alterado");
            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados dos produtos");
            ex.printStackTrace();
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }

    public boolean CRUD_excluir(Produtos p) {

        String sql = "DELETE FROM produto WHERE id_produto = ?"; // codigo em sql que apaga algo no banco de dados.
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, p.getId_produto());

            stmt.executeUpdate(); //INSERT UPDATE

            JOptionPane.showMessageDialog(null, "Produto excluido");
            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto");
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }
}
