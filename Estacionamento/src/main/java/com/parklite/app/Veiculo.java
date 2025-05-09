public abstract class Veiculo {
    private String modelo;
    private String cor;
    private String placa;

    public Veiculo(String modelo, String cor, String placa){
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;

    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

}