package br.com.meuprojeto.models;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private double limiteCartao;

    private List<Compra> compraList;
    public CartaoDeCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
        this.compraList = new ArrayList<>();
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public boolean comprar(Compra produto)
    {
        if (produto.getPrecoProduto() < limiteCartao){
            limiteCartao -= produto.getPrecoProduto();
            System.out.println("Compra realizada");
            compraList.add(produto);
            return true;
        }
        return false;
    }



}
