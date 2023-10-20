interface ElectricCarCharger {
    void charge();
}

class ElectricCarChargerImpl implements ElectricCarCharger {
    @Override
    public void charge() {
        System.out.println("Charging the electric car...");
    }
}

class GasPoweredCar {
    public void refuel() {
        System.out.println("Refueling the gas-powered car...");
    }
}


class ElectricCarChargerAdapter extends GasPoweredCar {
    private ElectricCarCharger electricCarCharger;

    public ElectricCarChargerAdapter(ElectricCarCharger electricCarCharger) {
        this.electricCarCharger = electricCarCharger;
    }

    public void charge() {
        electricCarCharger.charge();
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        GasPoweredCar gasCar = new GasPoweredCar();
        ElectricCarCharger electricCharger = new ElectricCarChargerImpl();

        gasCar.refuel(); // Existing functionality for the gas-powered car

        // adapter using
        ElectricCarChargerAdapter chargerAdapter = new ElectricCarChargerAdapter(electricCharger);
        chargerAdapter.charge();
    }
}
