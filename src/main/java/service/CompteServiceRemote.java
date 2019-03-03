package service;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entities.Compte;

@Remote
@WebService(targetNamespace="http://compte.client.banque/",name = "GestionCompte")
public interface CompteServiceRemote {
	@WebResult(name="Result")
	boolean creerCompte(@WebParam(name="compte")Compte c);
	
	@WebResult(name="Result")
	String supprimerCompte(@WebParam(name="numeroCompte")String numeroCompte);
	
	@WebResult(name="Result")
	List<Compte> afficherCompte();
}
