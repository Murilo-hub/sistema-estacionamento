import java.time.LocalDateTime;
import java.time.Duration;

public class Ticket {
    private Veiculo veiculo;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private boolean assinante;
    private static final double VALOR_POR_HORA = 5.0;

    public Veiculo getVeiculo() {
        return veiculo;
    }    

    public Ticket(Veiculo veiculo, boolean assinante) {
        this.veiculo = veiculo;
        this.assinante = assinante;
    }

    public void registrarEntrada() {
        this.horaEntrada = LocalDateTime.now();
    }

    public void registrarSaida() {
        this.horaSaida = LocalDateTime.now();
    }

    public double calcularValor() {
        if (assinante) {
            return 0.0;
        }
        if (horaEntrada == null || horaSaida == null) {
            throw new IllegalStateException("Horário de entrada ou saída não definido.");
        }

        Duration duracao = Duration.between(horaEntrada, horaSaida);
        long minutos = duracao.toMinutes();
        long horas = (minutos + 59) / 60;

        return horas * VALOR_POR_HORA;
    }
}
