package co.edu.unbosque.model;

import java.util.ArrayList;

public class CandidatoDAO {
	private ArrayList<CandidatoDTO> candidatos;
	
	public CandidatoDAO(){
		candidatos = new ArrayList<>();
	}
	
	public void agregarCandidato(String pNom,String pApe, int pCed, int pEdad, String pCar) {
		CandidatoDTO candidato = new CandidatoDTO(pNom, pApe, pCed, pEdad, pCar);
		candidatos.add(candidato);
	}
	
	public String listarCandidatos() {
		String lista = "";
		for (int i =0;i<candidatos.size();i++) {
		 lista +=
				  "Cedula: "+ candidatos.get(i).getCedula() + "\n" +
				  "Nombres: " + candidatos.get(i).getNombre() + "\n" +
				  "Apellidos: " + candidatos.get(i).getApellido() + "\n"+
				  "Edad: " + candidatos.get(i).getEdad() + "\n" +
				  "Cargo: " + candidatos.get(i).getCargo() + "\n";
		}
		return lista;
	}
	public String listarCandidatoPorCedula(int pCed) {
		String candidato = "No se ha encontrado al candidato";
		int i = 0;
		boolean encontrado = false;
		while(i<candidatos.size()&&!encontrado) {
			if(pCed == candidatos.get(i).getCedula()) {				
				candidato = "Cedula: "+ candidatos.get(i).getCedula() + "\n" +
						  "Nombres: " + candidatos.get(i).getNombre() + "\n" +
						  "Apellidos: " + candidatos.get(i).getApellido() + "\n"+
						  "Edad: " + candidatos.get(i).getEdad() + "\n" +
						  "Cargo: " + candidatos.get(i).getCargo() + "\n";
				encontrado = true;
			}else {
				encontrado = false;
				i++;
			}
		}
		return candidato;
	}
	public void eliminarCandidatos() {
		int i = 0;
		for(i=0;i<candidatos.size();i++) {
			candidatos.remove(i);
		}
	}
	public int buscarCandidato(int pCed) {
		int pos = -1, i=0;
		boolean encontrado = false;
		while(i<candidatos.size()&&!encontrado) {
			if(pCed == candidatos.get(i).getCedula()) {								
				encontrado = true;
				pos = i;
			}else {
				encontrado = false;
				i++;
			}
		}
		return pos;
	}
	public void modificarCandidato(int pos,String pNom,String pApe, int pCed, int pEdad, String pCar) {
		candidatos.get(pos).setNombre(pNom);
		candidatos.get(pos).setApellido(pApe);
		candidatos.get(pos).setCedula(pCed);
		candidatos.get(pos).setEdad(pEdad);
		candidatos.get(pos).setCargo(pCar);
	}
	
	public ArrayList<CandidatoDTO> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<CandidatoDTO> candidatos) {
		this.candidatos = candidatos;
	}
	
	
}
