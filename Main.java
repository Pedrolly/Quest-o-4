package br.inatel.questão4.S201;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Televisão tele = new Televisão();
        String canal;
        System.out.println("Entre com o modelo da sua TV: ");
        tele.setNome(teclado.nextLine());
        System.out.println("Digite qual canal você gostaria de ver");
        tele.setCanal(teclado.nextLine());
        System.out.println("entre se você quer diminuir ou aumentar o volume da TV(-1 para sair)");
        tele.setNum(teclado.nextInt());
        while (tele.getNum() != -1) {
            switch (tele.getNum()) {
                case 0: {
                    System.out.println("entre com o quanto você quer diminuir ");
                    tele.setNum3(teclado.nextInt());
                    tele.diminua(tele.getNum3());
                    System.out.println("gostaria de ver as informaçãoes da sua TV? digite 2:");
                    break;
                }
                case 1: {
                    System.out.println("entre com o quanto você quer aumentar ");
                    tele.setNum2(teclado.nextInt());
                    tele.aumenta(tele.getNum2());
                    System.out.println("gostaria de ver as informaçãoes da sua TV? digite 2:");
                    break;
                }
                case 2: {
                    tele.imprime();
                    break;
                }
            }
                    System.out.println("Digite -1 para parar de digitar");
                tele.setNum(teclado.nextInt());

    }
    }
    }