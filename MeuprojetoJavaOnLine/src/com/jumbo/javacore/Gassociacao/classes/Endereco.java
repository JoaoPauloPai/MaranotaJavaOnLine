package com.jumbo.javacore.Gassociacao.classes;

import com.jumbo.introducao.Iniciar;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
    }

    public Endereco(String rua_da_acacias_, int i, String mato_grosso) {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
