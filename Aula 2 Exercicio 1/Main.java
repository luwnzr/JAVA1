import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // COMEÇANDO O SISTEMA
        System.out.println("SISTEMA DE CADASTRO DE USUARIO");

        // VARIAVEIS
        String nome;
        String endereco;
        String telefoneFixo;
        String celular;
        String email;

        // SOLICITANDO DADOS
        // ENTRADA DE DADOS COM SCANNER
        // NOME
        Scanner meuTeclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = meuTeclado.nextLine();

        // ENDERECO
        System.out.println("Informe seu endereco: ");
        endereco = meuTeclado.nextLine();

        // TELEFONE FIXO
        System.out.println("Informe seu telefone fixo: ");
        telefoneFixo = meuTeclado.nextLine();

        // CELULAR
        System.out.println("Informe seu celular: ");
        celular = meuTeclado.nextLine();

        // E-MAIL
        System.out.println("Informe seu email: ");
        email = meuTeclado.nextLine();

        if (nome.isBlank() || endereco.isBlank() || telefoneFixo.isBlank() || celular.isBlank() || email.isBlank()) {
            System.out.println("Seu cadastro foi CANCELADO, alguma das informaçao esta vazia");
        }else if (telefoneFixo.equals(celular)){
            System.out.println("Seu cadastro foi CANCELADO, o telefone fixo e o celular são iguais. ");
        }else if (!email.contains("@") || !email.contains(".com")){
            System.out.println("Seu cadastro foi CANCELADO, o email não possui @ ou .com");
        }else{
            System.out.println("Cadastro efetuado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone Fixo: " + telefoneFixo);
            System.out.println("Celular: " + celular);
            System.out.println("E-mail: " + email);
        }
    }
}
