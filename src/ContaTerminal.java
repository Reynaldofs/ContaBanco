import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner ler = new Scanner (System.in);     

        int  numero;
        String  agencia;
        String  NomeCliente; 
        double  saldo;

        System.out.println("Por favor digite o número da Agencia !");
        agencia = ler.nextLine();

        System.out.println("Por favor digite o número da Conta !");
        numero = ler.nextInt();

        ler.nextLine();

        System.out.println("Por favor digite o seu Nome !");    
        NomeCliente = ler.nextLine();

        System.out.println("Por favor digite o seu saldo !");    
        saldo = ler.nextDouble();

        System.out.println("Ola " +NomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponivel para saque." );


    }
}
