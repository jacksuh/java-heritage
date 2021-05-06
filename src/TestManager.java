public class TestManager {

    public static void main(String[] args) {
        Manager g1 = new Manager();
        g1.setName("Marcos");
        g1.setCpf("123.456.789.10");
        g1.setWage(5000.0);

        System.out.println(g1.getName());
        System.out.println(g1.getCpf());
        System.out.println(g1.getWage());

        g1.setPassword(2222);
        boolean logged = g1.authenticate(2222);
        System.out.println(logged);
    }
}
