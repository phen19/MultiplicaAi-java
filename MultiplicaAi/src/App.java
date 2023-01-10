import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um número : ");
        Scanner entrada = new Scanner(System.in);
        String numero = entrada.nextLine();
        System.out.println("Tabuada de Multiplicação de " + numero);

        for (int i = 0; i<11; i++){
            System.out.println(numero + " x " + i +" = " + Integer.parseInt(numero) * i);
        }
    }
}
