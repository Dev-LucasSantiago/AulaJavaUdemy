package Fundamentos.Operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        //  && And(E)   || or(ou)    ^ xor(ou exclusivo)    !(Negação)
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        // Tabela verdade E AND &&
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //Tabela verdade OR OU ||
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //Tabela verdade XOR OU Exclusivo ^
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //Tabla verdade Não NOT !
        System.out.println(!true);
        System.out.println(!false);
    }
}
