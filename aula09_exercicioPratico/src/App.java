public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Pedro", 22, "M");
        pessoas[1] = new Pessoa("Maria", 25, "F");

        livros[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, pessoas[0]);
        livros[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoas[1]);
        livros[2] = new Livro("Java Avancado", "Maria Candido", 800, pessoas[0]);

        livros[0].abrir();
        livros[0].folhear(200);
        livros[0].avancarPag();
        System.out.println(livros[0].detalhes());
    }
}
