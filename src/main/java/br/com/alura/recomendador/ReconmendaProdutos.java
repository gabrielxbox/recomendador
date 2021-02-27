package br.com.alura.recomendador;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class ReconmendaProdutos {

	public static void main(String[] args) throws IOException, TasteException {
		
		DataModel produtos = new  Recomendador().getModeloDeProdutos();
		
		// função de segularidade para recomenda um produto
		Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);
	
		List<RecommendedItem> recommendedItems = recommender.recommend(7, 5);
	
		for (RecommendedItem recommendedItem : recommendedItems) {
			
			System.err.println("produto recomendado: " + recommendedItem);
		}
		
	}
	
}



