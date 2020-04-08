package model;

public class Produtos {

    private int id_produto;                  //id
    private String nome_produto;             // nome
    private String description;      //descricao
    private double preco;      //preco
    private int categoria_fk_id;
    private Categoria categoria;    // neste caso seria a chave estrangeira??????????????

    public Produtos() {
    }

    public Produtos(int id_produto, String nome_produto, String description, double preco, int categoria_fk_id, Categoria categoria) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.description = description;
        this.preco = preco;
        this.categoria_fk_id = categoria_fk_id;
        this.categoria = categoria;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCategoria_fk_id() {
        return categoria_fk_id;
    }

    public void setCategoria_fk_id(int categoria_fk_id) {
        this.categoria_fk_id = categoria_fk_id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
