//wsdl vers le sopa

package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

import entities.Compte;

@Stateless
@LocalBean
@WebService (targetNamespace = "http://compte.client.banque/",serviceName="Envelope")
public class CompteService implements CompteServiceRemote{

	@Override
	public boolean creerCompte(Compte c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String supprimerCompte(String numeroCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> afficherCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
