package commande;

public class Thermostat {
    private int temperature;

    public void augmenterTemperature(int degres) {
        temperature += degres;
        System.out.println("La température a augmenté de " + degres + "°, nouvelle température: " + temperature + "°");
    }

    public void diminuerTemperature(int degres) {
        temperature -= degres;
        System.out.println("La température a diminué de " + degres + "°, nouvelle température: " + temperature + "°");
    }

    public void eteindre() {
        System.out.println("Le thermostat est éteint");
    }
}

