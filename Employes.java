package metiers;

public class Employes extends Personnes {

	private String statut;

	public Employes(char civilite, String nom, String prenom, String adresse, String cp, String ville, int telephone,
			String statut) {
		super(civilite, nom, prenom, adresse, cp, ville, telephone);
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
