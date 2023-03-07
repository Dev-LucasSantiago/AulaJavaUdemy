package Controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o Número: ");

        int numero = Integer.parseInt(valor);

        if (numero %2 == 0){
            System.out.println("Par!");
        }
        if (numero % 2 == 1){
            System.out.println("Ímpar");
        }

        if (numero %2 == 1){
            System.out.println("Ímpar!");
        }else{
            System.out.println("Par");
        }
    }
}
