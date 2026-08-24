import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tipos Primitivos de Dados
        // Inteiros
        byte inteiro1 = 1; // vale 2 bits
        short inteiro2 = 23; // vale 3 bits
        int inteiro3 = 45; // vale 8 bits
        long inteiro4 = 678; // vale 16 bits

        // Reais
        float real1 = 911; // arrendonda as casas decimais
        double real2 = 123.14; // não arredonda as casa decimais

        // Literais
        char letra = 'a'; // apenas 1 caracter

        // Boolean - Verdadeiro ou Falso
        boolean boolean1;

        //Tipos Avançados de Dados
        String nome1 = "Olá Mundo - Hello Word";

        // Saída de Dados no Terminal com Println
        System.out.println(nome1);

        // Saída de dados com a classe Scanner - Recebe Dados
        Scanner meuTeclado = new Scanner(System.in);
        System.out.println("Sistema de controle de entrada");
        System.out.println("Informe um número: ");
        int idade = meuTeclado.nextInt();
        System.out.println("Idade informada: " + idade);

        // Verifique a idade do usuario é maior de idade
        // Caso positivo, ele pode entrar no evento, caso negativo, não pode entrar
        if(idade >=18){
            System.out.println("Pode entrar no evento");
        }else{
            System.out.println("Não pode entrar");
        }

        // Verificação de Salario
        System.out.println("Informe um salario: ");
        float salario = meuTeclado.nextFloat();
        // Informe se recebe mais, menos ou igual ao salario minimo
        if(salario >1621){
            System.out.println("Recebe mais que um salario minimo");
        }else if(salario == 1621){
            System.out.println("Recebe um salario minimo");
        }else{
            System.out.println("Recebe menos que um salario minimo");
        }

        // Verificação de Nome
        System.out.println("Informe seu nome: ");
        meuTeclado.nextLine();
        String nome = meuTeclado.nextLine();
        if(nome.equals("Maria")){ // Método para comparação de string
            System.out.println("Bem vinda Maria");
        }else{
            System.out.println("O nome informado não é Maria" + nome);
        }

        // Outros metodos para comparações de String
        // equalsIgnoreCase - Maria é igual a maria _ Caixa alta ou baixa
        // isEmpy - verifica se a string esta vazia
        // isBlanck - verifica se a String esta vazia, inclusive considerando espaços
        // contains - verifica se uma String esta contida dentro de outra String


    }
}