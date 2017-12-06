package persist;

public class Note {
// redouane
	
	private Long id;
	private Long note1;
	private String matieres;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNote1() {
		return note1;
	}
	public void setNote1(Long note1) {
		this.note1 = note1;
	}
	public String getMatieres() {
		return matieres;
	}
	public void setMatieres(String matieres) {
		this.matieres = matieres;
	}
	public Note(Long id, Long note1, String matieres) {
		super();
		this.id = id;
		this.note1 = note1;
		this.matieres = matieres;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", note1=" + note1 + ", matieres=" + matieres + "]";
	}
	
	
	
}
