package com.jumbo.javacore.Kenumeracao.classes;

public class TipoCliente {
    public enum TipoCli {
        PESSOA_FISICA(1), PESSOA_jurudica(2);

        private int tipo;


        TipoCli(int tipo) {
            this.tipo = tipo;

        }
    }


}