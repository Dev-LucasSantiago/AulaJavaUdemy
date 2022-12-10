package Operadores;

public class DesafioAritimeticos {

    public static void main(String[] args) {

        double numA = Math.pow(6* (3+2),2);
        double demA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double demB = 2;

        double superiorA = numA / demA;
        double superiorB = Math.pow(numB / demB,2);

        double supeior = Math.pow(superiorA - superiorB ,3);
        double inferior = Math.pow(10,3);

        double resultado = supeior / inferior;

        System.out.println("O resultado é: "+ resultado);
    }
}
