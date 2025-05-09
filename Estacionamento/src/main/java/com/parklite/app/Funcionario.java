public class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void registrarEntrada(Estacionamento estacionamento, Veiculo veiculo, boolean assinante) {
        estacionamento.registrarEntrada(veiculo, assinante);
    }
    
    public void registrarSaida(Estacionamento estacionamento, String placa) {
        estacionamento.registrarSaida(placa);
    }
    
}
