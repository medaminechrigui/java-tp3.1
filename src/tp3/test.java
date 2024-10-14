package tp3;

public class test {

	public static void main(String[] args) {
		vehicule v= new vehicule("clio","clasique",2000,20.000);
		vehicule v2=new vehicule("marcedes","fantome",2008,60.000);
		vehicule v3=new vehicule("kia","piacanto",2012,35.000);
		agence ag=new agence(10);
		ag.ajoutvehicule(v);
		ag.ajoutvehicule(v2);
		ag.ajoutvehicule(v3);
		System.out.println("-----------------tous le vehicule avec la marque marcdeces-----------------");
		ag.selection("marcedes");
		System.out.println("-----------------tous le vehicule inf a 40.000-----------------");
		
		ag.selection(40.0);
		System.out.println("-----------------le vehicule la plus anncien---------------------");
		ag.old();
	}
	}


