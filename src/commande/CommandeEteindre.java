package commande;

public class CommandeEteindre implements ICommande {
    private Thermostat thermostat;

    public CommandeEteindre(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void executer() {
        thermostat.eteindre();
    }
}
