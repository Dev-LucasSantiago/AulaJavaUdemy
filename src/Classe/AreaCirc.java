package Classe;

public class AreaCirc {
    final static double PI = 3.1415;
    double raio;

    AreaCirc(double raio){
        this.raio = raio;
    }

    double area(){
        return PI * Math.pow(raio,2);
    }

}
