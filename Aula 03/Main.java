import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CORREÇÃO ATIVIDADE 1

        Scanner teclado = new Scanner(System.in); // Receber info do teclado

        System.out.println("---- Sistema de Cadastro de Usuario ----"); // Cadastro de Usuarios
        //Nome
        System.out.print("Insira seu Nome: ");
        String nome = teclado.nextLine();
        // Endereco
        System.out.print("Insira seu Endereço: ");
        String endereco = teclado.nextLine();
        // Telefone
        System.out.print("Insira seu Telefone Fixo: ");
        String telefoneFixo = teclado.nextLine();
        // Celular
        System.out.print("Insira seu Celular: ");
        String celular = teclado.nextLine();;
        // Email
        System.out.print("Insira seu Email: ");
        String email = teclado.nextLine();

        // Operadores Lógicos
        // && - and
        // || - or
        // ! - negação
        // tenário

        // Estrutura Condicional
        if (nome.isEmpty() || endereco.isEmpty() || telefoneFixo.isEmpty() || celular.isEmpty() || email.isEmpty()){
            System.out.println("Preencha todas as informações!");
        }else if(telefoneFixo.equals(celular)){ // metodo que compara dois objetos
            System.out.println("A informação telefone fixo e celular não pode ser iguais.");
        }else if(!email.contains("@") || !email.contains(".com")){ // metodo que confere se contem o que esta em ""
            System.out.println("Email no padrão incorreto.");
        }else{
            System.out.println("Cadastro finalizado! Nome: " + nome + " | Endereço: " + endereco + " | Telefone Fixo: "
                    + telefoneFixo + " | Celular: " + celular + " | Email: " + email);
        }
    }
}
