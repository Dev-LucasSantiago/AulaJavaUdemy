package Conversões;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        //Conversão Implícita é quando um numero menor cabe numa variável maior ex: Int para Double
        //Conversão Explícita é quando um numero maior terá que caver numa variável de tipo menor ex: Double para Int
        double a = 1;       //Conversão Implícita
        System.out.println(a);

        float b = (float)1.12345; //Conversão Explícita (CAST)
        System.out.println(b);

        int c = 340;        //Conversão Explícita (CAST)
        byte d = (byte)c;
        System.out.println(d);

        double e = 1.999999;
        int f = (int)e;     //Conversão Explícita (CAST)
        System.out.println(f);
    }
}
