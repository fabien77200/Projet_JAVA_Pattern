package metiers;

public class Gerant extends Employes {

	private int nbConseillers;

	public Gerant(char civilite, String nom, String prenom, String adresse, String cp, String ville, int telephone,
			String statut, int nbConseillers) {
		super(civilite, nom, prenom, adresse, cp, ville, telephone, statut);
		this.nbConseillers = nbConseillers;
	}

	public int getNbConseillers() {
		return nbConseillers;
	}

	public void setNbConseillers(int nbConseillers) {
		this.nbConseillers = nbConseillers;
	}

}
