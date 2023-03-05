package service;

import java.util.List;

import javax.jws.WebService;

import model.Camion;
import repository.NouveauNRep;

@WebService(targetNamespace = "http://service/", portName = "CamionImpPort", serviceName = "CamionImpService")
public class CamionImp implements ICamion{
	
	private NouveauNRep rep = new NouveauNRep();
	
	@Override
	public void addCamion(Camion camion) {
		rep.addCamion(camion);
		
	}

	@Override
	public Camion findCamionById(int id) {
		return rep.findNN(id);
	}

	@Override
	public void updateCamionById(int id, Camion newCamion) {
		rep.updateCamionById(id, newCamion);
		
	}

	@Override
	public void deleteCamionById(int id) {
		rep.deleteCamionById(id);

		
	}

	@Override
	public List<Camion> getAllCamions() {
		return rep.getAllCamions();
	}

}
