package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Produtos;
import model.dao.ProdutosDAO;

public class ProdutosControl {

    public void recebe_lista_salva(List<String> l) {

        Produtos p = new Produtos();
        Categoria c = new Categoria();

        p.setNome_produto(l.get(0));
        p.setPreco(Double.parseDouble(l.get(1)));
   //     p.setCategoria_fk_id(Integer.parseInt(l.get(2)));
        p.setCategoria(c);
        c.setId_categoria(Integer.parseInt(l.get(2)));

        ProdutosDAO pdao = new ProdutosDAO();
        pdao.CRUD_salvar(p);
    }

    public void receber_tabela(DefaultTableModel modelo) {

        ArrayList<String> tabela = new ArrayList<>();
        
        ProdutosDAO pdao = new ProdutosDAO();
        
        Categoria c = new Categoria();

        for (Produtos p : pdao.CRUD_busca()) {
            modelo.addRow(new Object[]{
                p.getId_produto(),
                p.getNome_produto(),
                p.getCategoria().getNome_categoria(),
//                c.getNome_categoria(),
                p.getPreco()}
            );
        }
    }

    public void recebe_lista_altera(List<String> l) {

        Produtos p = new Produtos();
        Categoria c = new Categoria();
        
        p.setId_produto(Integer.parseInt(l.get(0)));
        p.setNome_produto(l.get(1));
        p.setPreco(Double.parseDouble(l.get(2)));
        p.setCategoria(c);
        c.setId_categoria(Integer.parseInt(l.get(3)));

        ProdutosDAO dao = new ProdutosDAO();
        dao.CRUD_alterar(p);
    }

    public void recebe_lista_exclui(List<String> l) {

        Produtos p = new Produtos();
        p.setId_produto(Integer.parseInt(l.get(0)));
        ProdutosDAO dao = new ProdutosDAO();
        dao.CRUD_excluir(p);
    }
        public boolean ValidaNumero(JTextField Numero) {
        long valor;
        if (Numero.getText().length() != 0) {
            try {
                valor = Long.parseLong(Numero.getText());
             
            } catch (NumberFormatException ex) {
                Numero.grabFocus();
               
                return false;
            }
        }  
            return true;
     
    }
}
