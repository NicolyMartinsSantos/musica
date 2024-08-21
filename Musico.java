public class Musico {
    private String nome;
    private String instrumento;

    public Musico(String nome, String instrumento) {
        this.nome = nome;
        this.instrumento = instrumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return "Musico{" +
                "nome='" + nome + '\'' +
                ", instrumento='" + instrumento + '\'' +
                '}';
    }
}
