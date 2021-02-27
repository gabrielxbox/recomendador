package br.com.alura.recomendador;

import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

public class Avaliador {

	public static void main(String[] args) throws IOException, TasteException {
		
		//determinando um valor fixo
		RandomUtils.useTestSeed();
		
		DataModel modelo = new Recomendador().getModeloDeCursos();
		
		//criando o propio biuder
		RecommenderBuilder builder = new  RecomendadorBuilder();
		
		RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		// criado para receber a magem de erro 
		double erro = evaluator.evaluate(builder, null, modelo, 0.9, 1.0);
	
		System.err.println("magem de erro :" + erro);
		
	}
	
}
