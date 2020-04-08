/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Cliente;
import model.Usuario;
import model.dao.ClienteDAO;
import model.dao.UsuariosDAO;

public class ClienteControl {

    public void recebe_lista_salva_cliente(List<String> l) {

        Cliente cliente = new Cliente();

        cliente.setTelefone(l.get(0));
        cliente.setCidade(l.get(1));
        cliente.setEstado(l.get(2));

        ClienteDAO dao = new ClienteDAO();
        dao.CRUD_salvar_cliente(cliente);
    }

    public void recebe_lista_altera_cliente(List<String> l) {

        Cliente cliente = new Cliente();

        cliente.setId_cliente(Integer.parseInt(l.get(0)));
        cliente.setTelefone(l.get(1));
        cliente.setCidade(l.get(2));
        cliente.setEstado(l.get(3));

        ClienteDAO dao = new ClienteDAO();
        dao.CRUD_altera_cliente(cliente);
    }

    public void recebe_lista_exclui_cliente(List<String> l) {

        Cliente cliente = new Cliente();

        cliente.setId_cliente(Integer.parseInt(l.get(0)));

        ClienteDAO dao = new ClienteDAO();
        dao.CRUD_excluir_cliente(cliente);
    }

}
