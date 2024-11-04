public class App {
    public static void main(String[] args) throws Exception {
        Video[] video = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 12 de PHP");
        video[2] = new Video("Aula 10 de HTML5");

        Gafanhoto[] gafanhoto = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        gafanhoto[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");

        /*System.out.println(video[0].toString());
        System.out.println(gafanhoto[0].toString());*/

        Visualizacao[] visualizacao = new Visualizacao[5];

        visualizacao[0] = new Visualizacao(gafanhoto[0], video[2]);
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());

        visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avaliar(87.0f);
        System.out.println(visualizacao[1].toString());
    }
}
