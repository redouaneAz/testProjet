package persist;

import java.util.Set;

public class UnePersonne {
	private Long p_id;
	private String nom;
	private String prenom;
	private int age;
	
	
	private Set<Note> lesNotes;
	
	
	
	public Set<Note> getLesNotes() {
		return lesNotes;
	}
	public void setLesNotes(Set<Note> lesNotes) {
		this.lesNotes = lesNotes;
	}
	public adresse getA() {
		return a;
	}
	public void setA(adresse a) {
		this.a = a;
	}
	
	
	private adresse a = new adresse();
	
	
	public Long getP_id() {
		return p_id;
	}
	public void setP_id(Long p_id) {
		this.p_id = p_id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UnePersonne(Long p_id, String nom, String prenom, int age) {
		super();
		this.p_id = p_id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public UnePersonne() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UnePersonne [p_id=" + p_id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
