package commande;

public class InterrupteurGlobal {
    private ICommande commande;

    public void setCommande(ICommande commande) {
        this.commande = commande;
    }

    public void eteindre() {
        commande.executer();
    }
}
