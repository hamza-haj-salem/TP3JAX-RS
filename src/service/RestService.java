package service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import dao.GestionLivreImp;
import model.Livre;

@Path("/livre")
public class RestService {
	
	GestionLivreImp dao ;
	 public RestService() {
		this.dao=new GestionLivreImp();
	}
	 
	@GET
	@Path("/listeLivre")
	public List<Livre> getAllLivre(){
		return dao.getAllLivre();
		
	}

}
