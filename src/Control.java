public class Control {

    private double sum;

    public void register(Employee f){
        double boni = f.getBonus();
        this.sum = this.sum + boni;
    }

    public double getSum(){
        return sum;
    }
}
