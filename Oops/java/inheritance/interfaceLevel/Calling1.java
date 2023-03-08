package inheritance.interfaceLevel;

public class Calling1 implements Sim4G {
    @Override
    public void features1() {
        System.out.println("1");
    }

    @Override
    public void newFeatures() {
        System.out.println("2");
    }

    @Override
    public void advancedFeatures() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        Calling1 calling1 = new Calling1();
        calling1.features1();
        calling1.newFeatures();
        calling1.advancedFeatures();
    }
}
