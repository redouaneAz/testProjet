package persist;

public class adresse {
	private String rue;
	private String ville;
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public adresse(String rue, String ville) {
		super();
		this.rue = rue;
		this.ville = ville;
	}
	public adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "adresse [rue=" + rue + ", ville=" + ville + "]";
	}



}
