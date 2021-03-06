package com.esprit.ewa.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Categorie")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	 private int idCategorie;
	public Set<Ouvrage> getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Set<Ouvrage> ouvrage) {
		this.ouvrage = ouvrage;
	}

	@Column
	 private String intituleCategorie;
	
	@ManyToMany(mappedBy="categorie",cascade = CascadeType.ALL)
	private Set<Ouvrage> ouvrage;
	 
	    public Categorie() {
	    }

		public int getIdCategorie() {
			return idCategorie;
		}

		public void setIdCategorie(int idCategorie) {
			this.idCategorie = idCategorie;
		}

		public String getIntituleCategorie() {
			return intituleCategorie;
		}

		public void setIntituleCategorie(String intituleCategorie) {
			this.intituleCategorie = intituleCategorie;
		}
		
	

		@Override
		public String toString() {
			return "Categorie [idCategorie=" + idCategorie + ", intituleCategorie=" + intituleCategorie + "]";
		}

		public Categorie(int idCategorie, String intituleCategorie) {
			super();
			this.idCategorie = idCategorie;
			this.intituleCategorie = intituleCategorie;
			
		}
}
