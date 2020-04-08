package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.dao.CategoriasDAO;

public class CategoriaControl {

    public void recebe_lista_salva(List<String> l) {

        Categoria c = new Categoria();
        c.setNome_categoria(l.get(0));
        CategoriasDAO dao = new CategoriasDAO();
        dao.CRUD_salvar(c);
    }

    public void receber_tabela(DefaultTableModel modelo) {

        ArrayList<String> tabela = new ArrayList<>();
        CategoriasDAO cdao = new CategoriasDAO();

//        modelo.setNumRows(0);
        for (Categoria c : cdao.CRUD_busca()) {
            modelo.addRow(new Object[]{
                c.getId_categoria(),
                c.getNome_categoria(),}
            );
        }
    }

    public void recebe_lista_altera(List<String> l2) {

        Categoria c = new Categoria();

        c.setNome_categoria(l2.get(1));
        c.setId_categoria(Integer.parseInt(l2.get(0)));
        CategoriasDAO dao = new CategoriasDAO();
        dao.CRUD_alterar(c);
    }

    public void recebe_lista_exclui(List<String> l) {

        Categoria c = new Categoria();
        c.setId_categoria(Integer.parseInt(l.get(0)));
        CategoriasDAO dao = new CategoriasDAO();
        dao.CRUD_excluir(c);
    }

    public boolean ValidaNumero(JTextField Numero) {
        long valor;
        if (Numero.getText().length() != 0) {
            try {
                valor = Long.parseLong(Numero.getText());
             
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Campo id só aceita números", "Informação", JOptionPane.INFORMATION_MESSAGE);
                Numero.grabFocus();
               
                return false;
            }
        }  
            return true;
     
    }
}
