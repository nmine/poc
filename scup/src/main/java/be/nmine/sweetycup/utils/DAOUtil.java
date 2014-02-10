package be.nmine.sweetycup.utils;

import java.util.ArrayList;
import java.util.List;

import be.nmine.sweetycup.domain.Article;

public class DAOUtil {
	public static final int TEMPLATE_MAIN = 0;
    public static final int TEMPLATE_LEFT_SIDE = 2;
    
	public void initData() {
		// main
	 	List<Article> articles = new ArrayList<Article>();
		Article article1 = new Article();
		article1.setTitle("Sweety Cup");
		article1.setAuthor("J.R.R tolkien");
		article1.setAsideContent("aside content2");
		article1.setContent("Sweety Cup, c'est le bonheur et la passion des jolies et bonnes choses, le plaisir de faire plaisir aux petits comme aux grands. Ce sont surtout de jolis petits moelleux surmontés d'un nappage de toutes les couleurs et de tous les goûts, réalisés avec des produits de qualité et naturels qui portent le joli nom de cupcakes."
			+ "Pour toutes vos occasions (anniversaire, baptême, enterrement de vie de jeune fille, mariage, cocktail, réunion...) ou simplement pour passer un agréable moment dans notre tea-room situé 11,rue de la source à Wavre.");
		article1.setTemplate(TEMPLATE_MAIN);
		Article article2 = new Article();
		article2.setTitle("Nos macarons");
		article2.setContent("Découvrez aussi nos macarons :Framboise,citron,café latte,pistache,spéculoos,caramel beurre salé,chocolat,Fruits de la passion,nougat,cassis." + "Prix:1,50 Eur/pièce");
//		article2.template = TEMPLATE_MAIN;
		Article article3 = new Article();
		article3.setTitle("Commandes");
		article3.setContent("Contactez-nous par mail pour de plus amples informations ou pour passer vos commandes.chantaldig@hotmail.com ou par téléphone au 010/88.87.80."
			+ "Tea-room ouvert du mardi au samedi de 10h à 18h.");
		article3.setTemplate(TEMPLATE_MAIN);
		// left
		Article article4 = new Article();
		article4.setTitle("Nos cupcakes");
		article4.setContent("Veuillez télécharger notre carte pour découvrir nos saveurs de cupcakes.TOUT EST RÉALISABLE, FAITES-NOUS PART DE VOS ENVIES"
			+ "Nous réalisons également des cupcakes sans gluten ainsi que des cupcakes sans sucre pour  personnes diabétiques.");
		article4.setTemplate(TEMPLATE_LEFT_SIDE);
		Article article5 = new Article();
		article5.setTitle("Sweety Cup");
		article5.setContent("Prix du cupcake :A partir de 2,50 EurPrix du cupcake sans sucre ou sans gluten : *A partir de 3,00 Eur"
			+ "Prix du cupcake personnalisable : De 3 Eur à 4 Eur suivant votre demande" + "Prix du mini cupcake : A partir de 1,30 Eur"
			+ "Pour vos évènements tarifs sur devis selon vos envies et souhaits." + "*Commande minimum de 6 cupcakes pour les sans gluten et sans sucre"
			+ "Commande de minimum 24h à l'avance pour les petites commandes,"
			+ "et 2 à 3 semaines à l'avance pour les évènements.Pour les commandes de dernières minutes, nous ferons tout notre possible pour vous aider.N'hésitez pas à nous contacter."
			+ "Vos commandes seront prises en compte dès le paiement d'un acompte de 50% du prix total de la commande et considérées comme réservées. Le solde est à payer à la livraison.");
		article5.setTemplate(TEMPLATE_LEFT_SIDE);
	}
}
