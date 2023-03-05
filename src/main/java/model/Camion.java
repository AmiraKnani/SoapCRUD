package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the camion database table.
 * 
 */
@Entity
@NamedQuery(name="Camion.findAll", query="SELECT c FROM Camion c")
public class Camion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int matricule;

	private String categorie;

	private float distance;

	private int poid;

	public Camion() {
	}

	public int getMatricule() {
		return this.matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public float getDistance() {
		return this.distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public int getPoid() {
		return this.poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

}