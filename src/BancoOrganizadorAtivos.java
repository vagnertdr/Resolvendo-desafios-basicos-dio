import java.util.*;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();

        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        // Adiciona -se esta linha abaixo para resolver o bug do nextLine que Ñ funciona corretamente.
        scanner.nextLine();

        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }
        //TODO: Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);

        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        // O metodo abaixo percorre e exibe o array conforme requerido no desafio - FOR EACH
        for (String a: ativos)
            System.out.println(a);

        // O metodo abaixo usando o WHILE - faz a mesma coisa do metodo acima porem n entendi mt bem a parte do ativos.remove(0)
//        while (!ativos.isEmpty()){
//            System.out.println(ativos.remove(0));
//        }

    }
}


