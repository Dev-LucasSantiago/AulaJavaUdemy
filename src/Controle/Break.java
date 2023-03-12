package Controle;

public class Break {
    public static void main(String[] args) {
        //Break ele interrompe e pula para o final
        for (int i = 0; i < 10 ; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}
