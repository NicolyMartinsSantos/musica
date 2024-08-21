import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private List<Musico> membros;

    public Banda(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musico> getMembros() {
        return membros;
    }

    public void addMusico(Musico musico) {
        this.membros.add(musico);
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nome='" + nome + '\'' +
                ", membros=" + membros +
                '}';
    }
}
