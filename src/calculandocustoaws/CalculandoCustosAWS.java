package calculandocustoaws;

import java.util.Scanner;

public class CalculandoCustosAWS {

    public static void main(String[] args) {        

        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de servidores desejados: ");
        int quantidadeServidores = scanner.nextInt();
        System.out.println("Digite a quantidade de bancos de dados desejados: ");
        int quantidadeBancosDados = scanner.nextInt();
        scanner.close();
                
        double custoTotal = calculaCustoTotal(custoPorHoraServidor, quantidadeServidores, custoPorHoraBancoDados, quantidadeBancosDados);
        
        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

       
        
    }
    
    public static double calculaCustoTotal(double custoPorHoraServidor, int quantidadeServidores, double custoPorHoraBancoDados, int quantidadeBancosDados){
        
        return (custoPorHoraServidor * quantidadeServidores) + (custoPorHoraBancoDados * quantidadeBancosDados);
        
    }
    
}
