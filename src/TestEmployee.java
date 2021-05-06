public class TestEmployee {

    public static void main(String[] args) {
        Employee jackson = new Employee();
        jackson.setName("Jackson");
        jackson.setCpf("123.456.789.10");
        jackson.setWage(2600.0);

        System.out.println(jackson.getBonus());
    }
}
