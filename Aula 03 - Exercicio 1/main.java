import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // INICIANDO O SISTEMA
        System.out.println("Sistema de venda de loja virtual!");

        // INFORME O NOME
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();

        // INFORME O TIPO DE CLIENTE
        System.out.print("Informe o tipo de cliente: 1 - Comum | 2 - Premium: ");
        int tipoCliente = teclado.nextInt();

        // INFORME A FORMA DE PAGAMENTO
        System.out.print("Informe a forma de pagamento: 1 - Pix | 2 - Cartão | 3 - Boleto: ");
        int tipoPagamento = teclado.nextInt();

        // INFORME O VALOR TOTAL DA COMPRA
        System.out.print("Informe o valor total da compra: R$ ");
        double valorCompra = teclado.nextDouble();

        // CÁLCULO DO DESCONTO
        int percentualDesconto = 0;

        if (tipoCliente == 2) {
            // Regras para Cliente Premium
            if (tipoPagamento == 1) {
                percentualDesconto = 20; // Premium + Pix
            } else {
                percentualDesconto = 10; // Premium + Outros (Cartão/Boleto)
            }
        } else if (tipoCliente == 1) {
            // Regras para Cliente Comum
            if (tipoPagamento == 1 && valorCompra >= 200.0) {
                percentualDesconto = 10; // Comum + Pix >= 200
            } else if ((tipoPagamento == 2 || tipoPagamento == 3) && valorCompra >= 500.0) {
                percentualDesconto = 5; // Comum + Cartão/Boleto >= 500
            }
        } // Caso não atenda nenhuma condição, o percentual de desconto continua 0.

        // PROCESSAMENTO DOS VALORES
        double valorDesconto = (valorCompra * percentualDesconto) / 100.0;
        double valorFinal = valorCompra - valorDesconto;

        // RESULTADOS ESPERADOS
        System.out.println("\n--- RESULTADO DA COMPRA ---");
        System.out.println("Cliente: " + nome);
        System.out.println("Percentual de desconto recebido: " + percentualDesconto + "%");
        System.out.printf("Valor original da compra: R$ %.2f\n", valorCompra);
        System.out.printf("Valor final da compra: R$ %.2f\n", valorFinal);

        // MENSAGEM FINAL
        if (percentualDesconto > 0) {
            System.out.println("Compra realizada com desconto!!");
        } else {
            System.out.println("Compra realizada sem desconto!!");
        }

        teclado.close(); // Fechando o Scanner
    }
}
