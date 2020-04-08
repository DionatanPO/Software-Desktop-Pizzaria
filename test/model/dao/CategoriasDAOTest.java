/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dionatan
 */
public class CategoriasDAOTest {

    public CategoriasDAOTest() {
    }

//    @Test
//    public void insert() {
//        Categoria c = new Categoria();
//        c.setNome_categoria("categoriaNova");
//        CategoriasDAO dao = new CategoriasDAO();
//        if (dao.CRUD_salvar(c)) {
//            System.out.println("Teste aprovado");
//        } else {
//            fail("Teste contem erros");
//        }
//    }
//    @Test
//    public void altera() {
//        String nome = "";
//        CategoriasDAO dao = new CategoriasDAO();
//        System.out.println("Teste para alterar categoria");
//        Categoria cc = new Categoria();
//        cc.setId_categoria(4);
//        for (Categoria c : dao.CRUD_busca()) {
//            if(c.getId_categoria() == cc.getId_categoria()){
//               nome = c.getNome_categoria();
//            }
//        }
//        System. out.println("Nome atual: " + nome);  
//        cc.setNome_categoria("testeUnit");
//        if (dao.CRUD_alterar(cc)) {
//            System.out.println("Teste aprovado!!!");
//            System.out.println("Nome alterado: " + cc.getNome_categoria());
//        } else {
//            fail("Teste contem erros");
//        }
//    }
//    @Test
//    public void excluir() {
//        CategoriasDAO dao = new CategoriasDAO();
//        System.out.println("Categorias cadastradas:");
//        for (Categoria c : dao.CRUD_busca()) {
//            System.out.println(c.getNome_categoria());
//        }
//        System.out.println("");
//        Categoria cc = new Categoria();
//        cc.setId_categoria(4);
//        // CategoriasDAO dao = new CategoriasDAO();
//        if (dao.CRUD_excluir(cc)) {
//            System.out.println("Teste aprovado");
//            System.out.println("Categorias apos a exlusao:");
//            for (Categoria ccc : dao.CRUD_busca()) {
//                System.out.println(ccc.getNome_categoria());
//            }
//        } else {
//            fail("Teste contem erros");
//        }
//    }
    @Test
    public void busca() {
        int numObjectRecebidos = 0;
        CategoriasDAO dao = new CategoriasDAO();
        System.out.println("Buscando categorias");
        for (Categoria c : dao.CRUD_busca()) {
            System.out.println(c.getNome_categoria());
            numObjectRecebidos++;
        }
        assertTrue(numObjectRecebidos > 0); // O retorno da busca retorna categorias!
        //assertTrue(numObjectRecebidos == 0);//o retorno da busca nao retornou 
        //nada, ou ainda nao a categorias salvas!
    }
}
