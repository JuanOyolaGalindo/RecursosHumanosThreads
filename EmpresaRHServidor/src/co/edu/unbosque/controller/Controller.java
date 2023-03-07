package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.CandidatoDTO;
import co.edu.unbosque.model.Empresa;
import co.edu.unbosque.model.persistence.FileHandler;

public class Controller{

	private Empresa emp;
	
	
	public Controller() {
		emp = new Empresa();
		emp.getCandi().setCandidatos((ArrayList<CandidatoDTO>) FileHandler.loadSerializable("candidatos.out"));
		int poscan;
	}
}
