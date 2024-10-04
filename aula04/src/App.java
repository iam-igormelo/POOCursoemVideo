public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();
        System.out.println("\n");
        Caneta c2 = new Caneta("BIC", "Laranja", 1.5f);
        c2.status();
    }
}