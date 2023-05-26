package commande;

public class CommandeAugmenterTemperature implements ICommande {
    private Thermostat thermostat;
    private int degres;

    public CommandeAugmenterTemperature(Thermostat thermostat, int degres) {
        this.thermostat = thermostat;
        this.degres = degres;
    }

    @Override
    public void executer() {
        thermostat.augmenterTemperature(degres);
    }
}
