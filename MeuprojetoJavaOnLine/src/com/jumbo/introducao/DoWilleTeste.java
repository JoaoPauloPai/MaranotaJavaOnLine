package com.jumbo.introducao;

public class DoWilleTeste {
    public static void main(String[] args) {
        int num = 1;
        do {
            switch (num){
                case 1:
                    System.out.println("Case 01");
                    break;
                case 2:
                    System.out.println("Case 02");
                    break;
                case 3:
                    System.out.println("Case 03");
                    break;
                case 4:
                    System.out.println("Case 04");
                    break;
                default:
                    System.out.println("Etrou no modo padrão");
                    break;
            }
            break;
        }while (num == 5);
        System.out.println("Entro  no willle");
    }
}
