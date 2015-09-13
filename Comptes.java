package metiers;

public class Comptes {

	private int id;
	private double solde;
	private String nomClient;
	private String dateOuverture;

	public Comptes(int id, double solde, String nomClient, String dateOuverture) {
		super();
		this.id = id;
		this.solde = solde;
		this.nomClient = nomClient;
		this.dateOuverture = dateOuverture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

}
