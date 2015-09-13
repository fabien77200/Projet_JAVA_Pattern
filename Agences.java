package metiers;

public class Agences {

	private int id;
	private String adresse;
	private String cp;
	private String ville;
	private String telephone;
	
	public Agences(int id, String adresse, String cp, String ville, String telephone) {
		this.id = id;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	
}
