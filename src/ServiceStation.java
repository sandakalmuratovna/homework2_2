public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }

    }

    public void check(Enginable enginable) {
        enginable.checkEngine();
    }

    public void check(Car car) {
        Vehicle vehicle = car;
        Enginable enginable = car;
        check(vehicle);
        check(enginable);
    }

    public void check(Truck truck) {
        Vehicle vehicle = truck;
        Enginable enginable = truck;
        check(vehicle);
        check(enginable);
        truck.checkTrailer();
    }
}