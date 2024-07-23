import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private final String descricao;
    private final LocalDateTime dataHora;

    public Transacao(String descricao) {
        this.descricao = descricao;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("[%s] %s", dataHora.format(formatter), descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}


