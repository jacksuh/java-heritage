public class VideoEditor extends Employee{

    public double getBonus(){
        System.out.println("Testing the VideoEditor bonus method");
        return super.getBonus() + 100;
    }
}
