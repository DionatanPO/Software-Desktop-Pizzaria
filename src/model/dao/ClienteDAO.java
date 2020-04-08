/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author Dionatan
 */
public class ClienteDAO {

    private Connection con = null;

    public ClienteDAO() {
        con = Conexao.Criar_conexao();
    }

    public boolean CRUD_salvar_cliente(Cliente cliente) {

        String sql = "INSERT INTO cliente (telefone,cidade,estado) VALUES (?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cliente.getTelefone());
            stmt.setString(2, cliente.getCidade());
            stmt.setString(3, cliente.getEstado());

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
        public boolean CRUD_altera_cliente(Cliente cliente) {

        con = Conexao.Criar_conexao();

        String sql = "UPDATE cliente SET  telefone = ?, cidade = ?, estado = ? WHERE id_cliente = ?"; // codigo em sql de enserir algo no banco de dados.

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cliente.getTelefone());
            stmt.setString(2, cliente.getCidade());
            stmt.setString(3, cliente.getEstado());
            stmt.setInt(4, cliente.getId_cliente());

            stmt.executeUpdate(); //INSERT UPDATE
            JOptionPane.showMessageDialog(null, "Cliente Alterado!");

            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Al aterar dados");
            ex.printStackTrace();
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }
        public boolean CRUD_excluir_cliente(Cliente cliente) {


        String sq2 = "DELETE FROM cliente WHERE id_cliente = ?";

        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(sq2);

            stmt.setInt(1, cliente.getId_cliente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente excluido!");

            return true; // se tudo de certo retorne verdadeiro.

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
            ex.printStackTrace();
            return false; // se der errado returne falso.

        } finally { // esta açao sempre sera essecultada intependente de qual try ou catch.
            Conexao.Fechar_conexao(con, stmt); //Fecha a conexao com o servidor.

        }
    }
    
//    public List<Cliente> CRUD_busca_cliente() { // buscar no banco de dados ver o que tem na tabela categorias
//        con = Conexao.Criar_conexao();
//        String sql = ("select * from cliente");
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        List<Cliente> todos_clientes = new ArrayList<>();
//        try {
//            stmt = con.prepareStatement(sql);
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                Cliente cliente = new Cliente();
//
//                cliente.setTelefone(rs.getString("telefone"));
//                cliente.setCidade(rs.getString("cidade"));
//                cliente.setEstado(rs.getString("estado"));
//
//                todos_clientes.add(cliente);
//
//            }
//        } catch (SQLException ex) {
//            System.out.println("Erro ao buscar dados de usuarios e clientes" + ex);
//            ex.printStackTrace();
//        } finally {
//            Conexao.Fechar_conexao(con, stmt, rs);
//        }
//        return todos_clientes;
//
//    }
}
