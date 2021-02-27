package br.com.alura.recomendador;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class Recomendador {
	
	public DataModel getModeloDeProdutos() throws IOException {
		return getModelo("dados.csv");
		
	}

	public DataModel getModeloDeCursos() throws IOException {
		return getModelo("cursos.csv");
	}

	private DataModel getModelo(String path) throws IOException {
		File file = new File("src/main/java/" + path); 
		// cria modelo
		return new FileDataModel(file);
	}
	
}
