package metiers;

public class ComptesCourants extends Comptes{

	private double autorisationDecouvert;
	
	public ComptesCourants(int id, double solde, String nomClient, String dateOuverture, double decouvert) {
		super(id, solde, nomClient, dateOuverture);
		this.autorisationDecouvert=decouvert;
	}

	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}
	
	
}
