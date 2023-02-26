package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CandidatoFile;

public class Empresa {
	private CandidatoDAO candi;
	private CandidatoFile candfil;
	
	
	public Empresa(){
		candi = new CandidatoDAO();
		candfil = new CandidatoFile();
	}

	public CandidatoDAO getCandi() {
		return candi;
	}

	public void setCandi(CandidatoDAO candi) {
		this.candi = candi;
	}

	public CandidatoFile getCandfil() {
		return candfil;
	}

	public void setCandfil(CandidatoFile candfil) {
		this.candfil = candfil;
	}
	
	
}
