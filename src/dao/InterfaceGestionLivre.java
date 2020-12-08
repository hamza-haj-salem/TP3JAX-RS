package dao;

import java.util.List;

import model.Livre;

public interface InterfaceGestionLivre {
	public Livre getLivreByID(int id);
	public List<Livre> getAllLivre();
	public void AjoutLivre(Livre l);
	public void ModifieLivreById(int id, String description,int qte );
	public void DeleteLivre(Livre l);
	
	
}
