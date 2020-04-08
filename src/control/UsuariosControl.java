package control;

import java.util.List;
import model.Cliente;
import model.Usuario;
import model.dao.UsuariosDAO;

public class UsuariosControl {

    public void recebe_lista_salva_usuario(List<String> l) {

        Usuario usuario = new Usuario();

        usuario.setNome_usuario(l.get(0));
        usuario.setPassword(l.get(1));
        usuario.setEmail(l.get(2));

        UsuariosDAO dao = new UsuariosDAO();
        dao.CRUD_salvar_usuario(usuario);
    }

    public void recebe_lista_altera_usuario(List<String> l) {

        Usuario usuario = new Usuario();
        usuario.setId_usuario(Integer.parseInt(l.get(0)));
        usuario.setNome_usuario(l.get(1));

        UsuariosDAO dao = new UsuariosDAO();
        dao.CRUD_altera_usuario(usuario);
    }

    public void recebe_lista_exclui_usuario(List<String> l) {

        Usuario usuario = new Usuario();
        usuario.setId_usuario(Integer.parseInt(l.get(0)));

        Cliente cliente = new Cliente();
        usuario.setCliente(cliente);

        cliente.setId_cliente(Integer.parseInt(l.get(0)));

        UsuariosDAO dao = new UsuariosDAO();
        dao.CRUD_excluir_usuario(usuario);
    }

}
