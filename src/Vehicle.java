public class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
