package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileHandler {

	
	private static File file;
	private static Scanner reader;
	private static PrintWriter writer ;
	private static Properties prop;
	private static FileInputStream fis;
	private static ObjectInputStream ois;
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;

	
	public static void writeSerializable(Object o, String url) {
		try {
			fos = new FileOutputStream("src/co/edu/unbosque/model/persistence/" + url);
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			System.out.println("File not found (serializable)");
			System.out.println(e.getMessage());
		}
		try {
			oos.writeObject(o);
			fos.close();
			oos.close();
		} catch (IOException e) {
			System.out.println("Error on writing (serializable)");
			System.out.println(e.getMessage());
		}
	}
		
	public static Object loadSerializable(String url) {
		Object tmp = null;
		try {
			fis = new FileInputStream("src/co/edu/unbosque/model/persistence/" + url);
			ois = new ObjectInputStream(fis);
			tmp = ois.readObject(); 
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			tmp = null;
		}
		return tmp;
	}

	public static String loadFile(String filename) {
		file = new File("src/co/edu/unbosque/model/persistence/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("cannot create new file");
				System.out.println(e.getMessage());
			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			while (reader.hasNext()) {
				content += reader.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("file dont exists");
			e.printStackTrace();
		}
		reader.close();
		return content;

	}

	public static void writeFile(String filename, String content) {
		file = new File("src/co/edu/unbosque/model/persistence/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can�t create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file don�t exists");
			e.printStackTrace();
		}
		writer.close();
	}

	public static void loadProperties(int sel) {
		prop = new Properties();
		if (sel == 1) {
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistence/spa.properties")));
			} catch (IOException e) {
				System.out.println("error loading properties file");
				System.out.println(e.getMessage());
			}
		} else if (sel == 2) {
			try {
				prop.load(new FileInputStream(new File("src/co/edu/unbosque/model/persistence/eng.properties")));
			} catch (IOException e) {
				System.out.println("error loading properties file");
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	
	public static Properties getProperties() {
		return prop;
	}
	
}
