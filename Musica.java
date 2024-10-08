public class Musica {
    private String titulo;
    private int duracao; // Duração em segundos

    public Musica(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
