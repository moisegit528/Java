package Projeto_Youtube_POO;

public class TubePlay {
    static void main(String[] args) {
        Video v[] = new Video [3];
        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula Herança");
        v[2] = new Video("Polimorfismo");
        //System.out.println(v[1]);

        Interacao g[] = new Interacao[2];
        g[0] = new Interacao("Jose", 25, "M", "Josezinho");
        g[1] = new Interacao("Juan", 25, "M", "juanzito");
        //System.out.println(g[0]);

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[1], v[0]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());

        /*
        vis[2] = new Visualizacao(g[0], v[1]);
        vis[3] = new Visualizacao(g[1], v[1]);
        vis[4] = new Visualizacao(g[0], v[1]);*/

    }
}
