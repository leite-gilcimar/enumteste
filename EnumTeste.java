package br.gov.mec.seb.util;

import java.time.format.TextStyle;
import java.util.Locale;
@SuppressWarnings("PMD")
enum Month {
    JAN(1){
        String getDetalhe(){
            return "Janeiro";
        }
    },
    FEV(2){
        String getDetalhe(){
            return "Fevereiro";
        }
    },
    MAR(3){
        String getDetalhe(){
            return "Março";
        }
    };

    private int month;

    private Month(int i){
        this.month = i;
    }

    public int getMonth(){
        return this.month;
    }
    abstract String getDetalhe();
}


public class Teste {
    public static void main(String[] args) {
        int num = 3;
        String mes = "";
        switch (num){
            case 1:
                mes = Month.JAN.getDetalhe();
                break;
            case 2:
                mes = Month.FEV.getDetalhe();
                break;
            case 3:
                mes = Month.MAR.getDetalhe();
                break;
        }
        System.out.printf("Mes: %s \n", mes);
        for (Month month: Month.values()){
            System.out.println(month.getDetalhe());
        }
        System.out.println(java.time.Month.of(3).getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("pt-BR")).toUpperCase());
    }
}
