package br.com.meuprojeto.models;

public class Compra {
    String nomeProduto;
    private double precoProduto;

    public Compra(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    @Override
    public String toString() {
        return "Nome Produto: " + this.nomeProduto + ", Preço: " + this.precoProduto;
    }


}
