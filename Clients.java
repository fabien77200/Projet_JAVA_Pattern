package metiers;

public class Clients extends Personnes {

	private String nomConseiller;
	private double montantPatrimoine;

	public Clients(char civilite, String nom, String prenom, String adresse, String cp, String ville, int telephone,
			String nomConseiller, double montantPatrimoine) {
		super(civilite, nom, prenom, adresse, cp, ville, telephone);
		this.nomConseiller = nomConseiller;
		this.montantPatrimoine = montantPatrimoine;
	}

	public String getNomConseiller() {
		return nomConseiller;
	}

	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

	public double getMontantPatrimoine() {
		return montantPatrimoine;
	}

	public void setMontantPatrimoine(double montantPatrimoine) {
		this.montantPatrimoine = montantPatrimoine;
	}

}
