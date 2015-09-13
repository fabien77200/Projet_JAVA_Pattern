package metiers;

public class Personnes {

	private char civilite;
	private String nom;
	private String prenom;
	private String adresse;
	private String cp;
	private String ville;
	private int telephone;

	public Personnes(char civilite, String nom, String prenom, String adresse, String cp, String ville, int telephone) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.telephone = telephone;
	}

	public char getCivilite() {
		return civilite;
	}

	public void setCivilite(char civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

}
