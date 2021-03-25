package com.jumbo.introduçao.controledefluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Porém as parcelas não pode ser menor que 1000
        double valorTotal = 60000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela ;
            double juros = (valorTotal * 5)/ valorParcela;
            double valorParcelaTotal = valorParcela + juros;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Valor total das Parcelas " + parcela + " R$ " + valorParcela + " Valor dos juros R$ " + juros);
            System.out.println("Valor total a pagar com Juros "+ parcela + " vezes de R$ "+ valorParcelaTotal);
        }
    }
}
