import java.util.Scanner;
import java.text.DecimalFormat;

public class BancoApp {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();


        int periodo = scanner.nextInt();

        double valorFinal = calcularJuros(valorInicial, taxaJuros, periodo);



//        calcularJuros(valorInicial, taxaJuros, periodo);

        System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);
        System.out.println();


    }
    static double calcularJuros(double valor_inicial, double taxa_juros, int periodo){
        double valor_final = valor_inicial * Math.pow(1 + taxa_juros,periodo);
        return valor_final;



    }
}
