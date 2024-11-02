public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro();

        c.reagir("Ola");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
    }
}
