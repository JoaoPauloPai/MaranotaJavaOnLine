package com.jumbo.introducao.controledefluxo�ao.controledefluxo;

public class ControleDeFluxo6 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Porém as parcelas não pode ser menor que 1000
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (parcela <= 1000){
                continue;
            }
            System.out.println("Valor total a pagar " + parcela + " vezes de R$ " + valorParcela);
        }

    }
}
