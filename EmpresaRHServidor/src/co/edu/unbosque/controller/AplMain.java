package co.edu.unbosque.controller;

public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		Servidor s = new Servidor(6969);
		s.start();
	}

}
