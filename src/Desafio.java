import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        float valorSalario = lerDados.nextFloat();
        float valorBeneficios = lerDados.nextFloat();

        float valorImposto = 0;

            if (valorSalario >=0 && valorSalario <=1100) {
                valorImposto = 0.05F * valorSalario;

            } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
                valorImposto = 0.10F * valorSalario;
            } else {
                valorImposto = 0.15F * valorSalario;
            }

        System.out.println("Testando Calculo basico :" + (0.05f * valorSalario ));
            float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
