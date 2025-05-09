import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Ticket> ticketsAtivos = new ArrayList<>();
    private ArrayList<Ticket> historicoTickets = new ArrayList<>();

    public void registrarEntrada(Veiculo veiculo, boolean assinante) {
        Ticket ticket = new Ticket(veiculo, assinante);
        ticket.registrarEntrada();
        ticketsAtivos.add(ticket);
        System.out.println("Entrada registrada para o veículo: " + veiculo.getPlaca());
    }

    public void registrarSaida(String placa) {
        Ticket ticketEncontrado = null;

        for (Ticket ticket : ticketsAtivos) {
            if (ticket.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                ticketEncontrado = ticket;
                break;
            }
        }

        if (ticketEncontrado != null) {
            ticketEncontrado.registrarSaida();
            double valor = ticketEncontrado.calcularValor();

            ticketsAtivos.remove(ticketEncontrado);
            historicoTickets.add(ticketEncontrado);

            System.out.println("Saída registrada para o veículo: " + placa);
            System.out.println("Valor a pagar: R$ " + valor);
        } else {
            System.out.println("Veículo com placa " + placa + " não encontrado.");
        }
    }

    public void listarVeiculosEstacionados() {
        System.out.println("Veículos estacionados atualmente:");
        for (Ticket ticket : ticketsAtivos) {
            System.out.println("- " + ticket.getVeiculo().getPlaca());
        }
    }
}
