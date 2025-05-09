import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Estacionamento estacionamento = new Estacionamento();
        Funcionario funcionario = new Funcionario("João", "F001");
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando){
            System.out.println("====Sistema de Estacionamento===");
            System.out.println("1. Registrar entrada do veiculo;");
            System.out.println("2. Registrar saida do veiculo;");
            System.out.println("3. Listar veiculos estacionados;");
            System.out.println("0. Sair do sistema;");
            System.out.println("================================");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("===Resgistrar a entrada do veiculo===");
                    System.out.println("Informe o modelo do veiculo: ");
                    String modelo = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Informe a coloração do veiculo: ");
                    String cor = scanner.nextLine();

                    System.out.println("Informe a placa do veiculo: ");
                    String placa = scanner.nextLine();

                    System.out.println("O veiculo é de algum assinante?");
                    String resposta = scanner.nextLine();
                    boolean assinante = resposta.equalsIgnoreCase("sim");
                    
                    System.out.println("Informe o tipo do veiculo (carro ou moto): ");
                    String tipoVeiculo = scanner.nextLine().toLowerCase();
                    
                    Veiculo veiculo;
                    if(tipoVeiculo.equals("carro")){
                        veiculo = new Carro(modelo, cor, placa);
                    }else if(tipoVeiculo.equals("moto")){
                        veiculo = new Moto(modelo, cor, placa);
                    }else{
                        System.out.println("Tipo de veiculo invalido, digite carro ou moto: ");
                        break;
                    }

                    funcionario.registrarEntrada(estacionamento, veiculo, assinante);

                    break;
                case 2:
                    System.out.println("===Registrar a saida do veiculo===");
                    System.out.println("Informe a placa do veiculo: ");
                    String placaSaida = scanner.nextLine();

                    funcionario.registrarSaida(estacionamento, placaSaida);
                    break;

                case 3:
                    estacionamento.listarVeiculosEstacionados();
                    break;

                case 0:
                executando = false;
                System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("opcao invalida");                    
                    break;
            }

        }
    }
}
