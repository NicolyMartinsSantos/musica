public class Main {
    public static void main(String[] args) {
        // Criando músicos
        Musico musico1 = new Musico("João", "Guitarra");
        Musico musico2 = new Musico("Maria", "Bateria");

        // Criando banda
        Banda banda = new Banda("Os Superstars");
        banda.addMusico(musico1);
        banda.addMusico(musico2);

        // Criando músicas
        Musica musica1 = new Musica("Hit Parade", 210);
        Musica musica2 = new Musica("Summer Vibes", 180);

        // Criando CD
        CD cd = new CD("Greatest Hits", Estilo.ROCK);
        cd.addMusica(musica1);
        cd.addMusica(musica2);

        // Exibindo informações
        System.out.println(banda);
        System.out.println(cd);
    }
}
