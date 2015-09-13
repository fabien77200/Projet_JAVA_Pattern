package metiers;

public class ComptesEpargnes extends Comptes {

	private double remuneration;

	public ComptesEpargnes(int id, double solde, String nomClient, String dateOuverture, double remuneration) {
		super(id, solde, nomClient, dateOuverture);
		this.remuneration = remuneration;
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

}
