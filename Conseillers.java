package metiers;

public class Conseillers extends Employes {

	private String[] porteFeuilleClients;

	public Conseillers(char civilite, String nom, String prenom, String adresse, String cp, String ville, int telephone,
			String statut) {
		super(civilite, nom, prenom, adresse, cp, ville, telephone, statut);
		porteFeuilleClients = new String[10];
	}

	public String[] getPorteFeuilleClients() {
		return porteFeuilleClients;
	}

	public void setPorteFeuilleClients(String[] porteFeuilleClients) {
		this.porteFeuilleClients = porteFeuilleClients;
	}

}
