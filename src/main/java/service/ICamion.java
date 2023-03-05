package service;

import java.util.List;

import model.Camion;

public interface ICamion {
	public void addCamion(Camion camion);

	public Camion findCamionById(int id);

	public void updateCamionById(int id, Camion newCamion);

	public void deleteCamionById(int id);

	public List<Camion> getAllCamions();
}
