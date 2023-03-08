package inheritance.classLeve;

public class Sim4G extends Sim3G{
    public  void sim4G() {
        System.out.println("Add new Network Volte , H+ ");
    }
    public static void main(String[] args) {
        Sim4G sim4G = new Sim4G();
        sim4G.sim2G();
        sim4G.sim3G();
        sim4G.sim4G();

    }
}
