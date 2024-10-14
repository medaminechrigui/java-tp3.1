package tp3;

public class vehicule {
	private int num;
	private String marq;
	private String model;
	private int annee;
	private double prix;
	static int count=0;
	public vehicule(String marq1,String model1,int annee1,double prix1) {
		num=count;
		marq=marq1;
		model=model1;
		annee=annee1;
		prix=prix1;
		count++;
	}
	 public String toString() {
	    	return (num+" : "+marq+" : "+model+" : "+annee+" : "+prix);
	}
	 void decrisvehicule() {
		 System.out.println(toString());
	 }
	 public  String getMarq() {
		 return marq;
	 }
	 public  String setMarq() {
		 return marq;
	 }
	 public  String getModel() {
		 return model;
	 }
	 public  String setModel() {
		 return model;
	 }
	 public  double getPrix() {
		 return prix;
	 }
	 public  double setPrix() {
		 return prix;
	 }
	 public int getAnnee() {
		 return annee;
	 }
	 public int getCount() {
		 return count;
	 }
	 
}
