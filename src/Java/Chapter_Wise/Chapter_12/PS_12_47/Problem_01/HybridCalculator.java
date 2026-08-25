package Java.Chapter_Wise.Chapter_12.PS_12_47.Problem_01;

public class HybridCalculator {
    private int a;
    private double b;

    public void setHybridCalculator(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getHySum() {
        return a + Math.sin(b);
    }
}