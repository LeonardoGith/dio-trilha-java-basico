import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner 
        // Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no temrinal
        //Exibir a mensagem conta criada
        
        String NomeCliente;
        int Numero;
        double Saldo;
        String Agencia;
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ! ");
        NomeCliente = pergunta.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        Agencia = pergunta.nextLine();
        System.out.println("Por favor, digite o seu número da conta: ! ");
        Numero = pergunta.nextInt();
        System.out.println("Por favor, digite o número do seu Saldo !");
        Saldo = pergunta.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia+ ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

        pergunta.close();




    }
}
