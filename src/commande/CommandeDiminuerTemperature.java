package commande;

public class CommandeDiminuerTemperature implements ICommande {
    private Thermostat thermostat;
    private int degres;

    public CommandeDiminuerTemperature(Thermostat thermostat, int degres) {
        this.thermostat = thermostat;
        this.degres = degres;
    }

    @Override
    public void executer() {
        thermostat.diminuerTemperature(degres);
    }
}
