package Seminar1OOP;

public class HotDrink extends Bottle{
    private int temperature;

    public HotDrink(String name, Double cost, Double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
