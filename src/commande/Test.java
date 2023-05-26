package commande;

public class Test {
    private Thermostat thermostat;
    private Telecommande telecommande;
    private InterrupteurGlobal interrupteurGlobal;

    public Test() {
        thermostat = new Thermostat();
        telecommande = new Telecommande();
        interrupteurGlobal = new InterrupteurGlobal();
    }

    public void lancerTest1() {
        
        telecommande.setCommande(new CommandeAugmenterTemperature(thermostat, 5));
        telecommande.presserBouton();

        
        telecommande.setCommande(new CommandeDiminuerTemperature(thermostat, 2));
        telecommande.presserBouton();

        
        interrupteurGlobal.setCommande(new CommandeEteindre(thermostat));
        interrupteurGlobal.eteindre();
    }

    public void lancerTest2() {
        
        telecommande.setCommande(new CommandeAugmenterTemperature(thermostat, 10));
        telecommande.presserBouton();

        
        telecommande.setCommande(new CommandeDiminuerTemperature(thermostat, 7));
        telecommande.presserBouton();

        
        interrupteurGlobal.setCommande(new CommandeEteindre(thermostat));
        interrupteurGlobal.eteindre();
    }
}
