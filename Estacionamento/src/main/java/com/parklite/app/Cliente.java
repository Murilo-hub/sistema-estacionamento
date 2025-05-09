import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Veiculo> veiculos;

    public Cliente(String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public boolean possuiVeiculo(String placa) {
        return veiculos.stream().anyMatch(v -> v.getPlaca().equalsIgnoreCase(placa));
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getNome() {
        return nome;
    }
}
