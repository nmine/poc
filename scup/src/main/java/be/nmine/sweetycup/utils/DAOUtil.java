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
		article1.setContent("Sweety Cup, c'est le bonheur et la passion des jolies et bonnes choses, le plaisir de faire plaisir aux petits comme aux grands. Ce sont surtout de jolis petits moelleux surmont�s d'un nappage de toutes les couleurs et de tous les go�ts, r�alis�s avec des produits de qualit� et naturels qui portent le joli nom de cupcakes."
			+ "Pour toutes vos occasions (anniversaire, bapt�me, enterrement de vie de jeune fille, mariage, cocktail, r�union...) ou simplement pour passer un agr�able moment dans notre tea-room situ� 11,rue de la source � Wavre.");
		article1.setTemplate(TEMPLATE_MAIN);
		Article article2 = new Article();
		article2.setTitle("Nos macarons");
		article2.setContent("D�couvrez aussi nos macarons :Framboise,citron,caf� latte,pistache,sp�culoos,caramel beurre sal�,chocolat,Fruits de la passion,nougat,cassis." + "Prix:1,50 Eur/pi�ce");
//		article2.template = TEMPLATE_MAIN;
		Article article3 = new Article();
		article3.setTitle("Commandes");
		article3.setContent("Contactez-nous par mail pour de plus amples informations ou pour passer vos commandes.chantaldig@hotmail.com ou par t�l�phone au 010/88.87.80."
			+ "Tea-room ouvert du mardi au samedi de 10h � 18h.");
		article3.setTemplate(TEMPLATE_MAIN);
		// left
		Article article4 = new Article();
		article4.setTitle("Nos cupcakes");
		article4.setContent("Veuillez t�l�charger notre carte pour d�couvrir nos saveurs de cupcakes.TOUT EST R�ALISABLE, FAITES-NOUS PART DE VOS ENVIES"
			+ "Nous r�alisons �galement des cupcakes sans gluten ainsi que des cupcakes sans sucre pour  personnes diab�tiques.");
		article4.setTemplate(TEMPLATE_LEFT_SIDE);
		Article article5 = new Article();
		article5.setTitle("Sweety Cup");
		article5.setContent("Prix du cupcake :A partir de 2,50 EurPrix du cupcake sans sucre ou sans gluten : *A partir de 3,00 Eur"
			+ "Prix du cupcake personnalisable : De 3 Eur � 4 Eur suivant votre demande" + "Prix du mini cupcake : A partir de 1,30 Eur"
			+ "Pour vos �v�nements tarifs sur devis selon vos envies et souhaits." + "*Commande minimum de 6 cupcakes pour les sans gluten et sans sucre"
			+ "Commande de minimum 24h � l'avance pour les petites commandes,"
			+ "et 2 � 3 semaines � l'avance pour les �v�nements.Pour les commandes de derni�res minutes, nous ferons tout notre possible pour vous aider.N'h�sitez pas � nous contacter."
			+ "Vos commandes seront prises en compte d�s le paiement d'un acompte de 50% du prix total de la commande et consid�r�es comme r�serv�es. Le solde est � payer � la livraison.");
		article5.setTemplate(TEMPLATE_LEFT_SIDE);
	}
}
