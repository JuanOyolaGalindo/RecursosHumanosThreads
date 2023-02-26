package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.CandidatoDTO;

public class CandidatoFile {
	
	private String ruta = "candidatos.dat";
	private ArrayList<CandidatoDTO> candidatos;
	
	public String guardarCandidatos(ArrayList<CandidatoDTO> candidato) {
		String mensaje = "";
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));	
			out.writeObject(candidato);
			out.close();
		}
		catch (IOException e) {
			mensaje = "Error de IO";
		}
		return mensaje;
		
	}
	public ArrayList<CandidatoDTO> leerCandidatos() throws IOException{
		ObjectInputStream in;	
		in = new ObjectInputStream(new FileInputStream(ruta));
        try {
			candidatos = (ArrayList<CandidatoDTO>)in.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        in.close();	        
	return candidatos;
	}
	
}
