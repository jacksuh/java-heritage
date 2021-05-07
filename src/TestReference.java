public class TestReference {

    public static void main(String[] args) {

        Manager g1 = new Manager();
        g1.setName("Marcos");
        g1.setWage(5000.0);


        Employee f = new VideoEditor();
        f.setWage(2000.0);

        VideoEditor ev = new VideoEditor();
        ev.setWage(2500.0);

        Control control = new Control();
        control.register(g1);
        control.register(f);
        control.register(ev);

        System.out.println(control.getSum());

    }
}
