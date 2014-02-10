package be.nmine.sweetycup.utils;

import java.util.ArrayList;
import java.util.List;

import be.nmine.sweetycup.domain.Article;
import be.nmine.sweetycup.domain.Comment;

public class DAOUtil {
	public static final int TEMPLATE_MAIN = 0;
    public static final int TEMPLATE_LEFT_SIDE = 2;
    //transactional on dao method otherwhise roll back
	public static List<Article>  initData() {
		// main
	 	List<Article> articles = new ArrayList<Article>();
		Article article1 = new Article();
		article1.setTitle("Sweety Cup");
		article1.setAuthor("J.R.R tolkien");
		article1.setAsideContent("aside content2");
		article1.setContent("Sweety Cup, c'est le bonheur et la passion des jolies et bonnes choses, le plaisir de faire plaisir aux petits comme aux grands. Ce sont surtout de jolis petits moelleux surmonts d'un nappage de toutes les couleurs et de tous les gots, raliss avec des produits de qualit et naturels qui portent le joli nom de cupcakes."
			+ "Pour toutes vos occasions (anniversaire, baptme, enterrement de vie de jeune fille, mariage, cocktail, runion...) ou simplement pour passer un agrable moment dans notre tea-room situ 11,rue de la source  Wavre.");
		article1.setTemplate(TEMPLATE_MAIN);
		Article article2 = new Article();
		article2.setTitle("Nos macarons");
		article2.setContent("Dcouvrez aussi nos macarons :Framboise,citron,caf latte,pistache,spculoos,caramel beurre sal,chocolat,Fruits de la passion,nougat,cassis." + "Prix:1,50 Eur/pice");
//		article2.template = TEMPLATE_MAIN;
		Article article3 = new Article();
		article3.setTitle("Commandes");
		article3.setContent("Contactez-nous par mail pour de plus amples informations ou pour passer vos commandes.chantaldig@hotmail.com ou par thone au 010/88.87.80."
			+ "Tea-room ouvert du mardi au samedi de 10h  18h.");
		article3.setTemplate(TEMPLATE_MAIN);
		// left
		Article article4 = new Article();
		article4.setTitle("Nos cupcakes");
		article4.setContent("Veuillez tlcharger notre carte pour dcouvrir nos saveurs de cupcakes.TOUT EST RALISABLE, FAITES-NOUS PART DE VOS ENVIES"
			+ "Nous rlisons alement des cupcakes sans gluten ainsi que des cupcakes sans sucre pour  personnes diabtiques.");
		article4.setTemplate(TEMPLATE_LEFT_SIDE);
		Article article5 = new Article();
		article5.setTitle("Sweety Cup");
		article5.setContent("Prix du cupcake :A partir de 2,50 EurPrix du cupcake sans sucre ou sans gluten : *A partir de 3,00 Eur"
			+ "Prix du cupcake personnalisable : De 3 Eur  4 Eur suivant votre demande" + "Prix du mini cupcake : A partir de 1,30 Eur"
			+ "Pour vos vnements tarifs sur devis selon vos envies et souhaits." + "*Commande minimum de 6 cupcakes pour les sans gluten et sans sucre"
			+ "Commande de minimum 24h  l'avance pour les petites commandes,"
			+ "et 2  3 semaines l'avance pour les vnements.Pour les commandes de dernires minutes, nous ferons tout notre possible pour vous aider.N'hsitez pas nous contacter."
			+ "Vos commandes seront prises en compte ds le paiement d'un acompte de 50% du prix total de la commande et considres comme rserves. Le solde est  payer  la livraison.");
		article5.setTemplate(TEMPLATE_LEFT_SIDE);
		articles.add(article1);
		articles.add(article2);
		articles.add(article3);
		articles.add(article4);
		articles.add(article5);
		return articles;
	}
	
	public static List<Comment> createComment() {
		List<Comment> comments = new ArrayList<Comment>();
		Comment comment = new Comment();
		comment.setContent("On vous a dcouvert l'occasion de l'Art du Commerce, on a go et on a ador ! Quelle bonne ide de venir s'installer dans le ptonnier de Wavre avec des dlicieux petit geaux, a manquait. On vous souhaite plein de bonnes choses pour la suite et il est certain qu'en passant par Wavre, on aura du mal  ne pas faire arrt chez Sweety Cup. Bonne route :)");
		comment.setPseudo("Curlie");
		comment.setEmail("curlie@hotmail.com");
		Comment comment1 = new Comment();
		comment1.setContent("Je suis passe chez vous avec mon amie samedi aprs-midi et je vous remercie pour ces cupcakes qui sont un pur dlice en plus d'tre un rgal pour les yeux. (Et mon mari a ador le speeculoos que je lui ai ramen mais plus encore le coco-chocolat ! :)");
		comment1.setPseudo("Catimini");
		comment1.setEmail("Catimini@hotmail.com");
		Comment comment2 = new Comment();
		comment2.setContent("Ils sont vraiment incroyable ! Mais vraiment ... mmmmmmmm ....	");
		comment2.setPseudo("Pieter");
		comment2.setEmail("Pieter@hotmail.com");
		comments.add(comment);
		comments.add(comment1);
		comments.add(comment2);
		return comments;
//		commentDao.save(comment);
//		commentDao.save(comment1);
//		commentDao.save(comment2);
//		comment.setDate(calendar);
	}
}
