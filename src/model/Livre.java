package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Livre {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private int qte;
	
	public Livre(int id, String description, int qte) {
		super();
		this.id = id;
		this.description = description;
		this.qte = qte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
	
	
	
}
