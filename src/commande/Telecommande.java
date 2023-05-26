package commande;

public class Telecommande {
    private ICommande commande;

    public void setCommande(ICommande commande) {
        this.commande = commande;
    }

    public void presserBouton() {
        commande.executer();
    }
}
