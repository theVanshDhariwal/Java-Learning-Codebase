package Java.Chapter_Wise.Chapter_12.PS_12_47.Problem_01;

public class ScientificCalculator {
    private double a;
    private double b;

    public void setScientificCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getScSum() {
        return Math.sin(a) + Math.sin(b);
    }
}