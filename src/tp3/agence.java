package tp3;

public class agence {
	private int max;
	private vehicule t[]=new vehicule[max];
	public int n;
	public agence(int max) {
		this.max=max;
		t=new vehicule[max];
	}
	void ajoutvehicule(vehicule v) {
		if (n<max) {
			t[n]=v;
			n++;
		}
		else {
			System.out.println("il n y a pas de place dans l agence");
		}
	}
	void selection(int n) {
		if (this.n>=n) {
			t[n-1].decrisvehicule();
		}
		else {
			System.out.println("il n y a pas de vehicule dans l agence avec cette numero");
		}
	}
	void selection(String mq) {
		int i;
		int m=0;
		for (i=0;i<n;i++) {
			if (t[i].getMarq().equals(mq)) {
				t[i].decrisvehicule();
			}
			else {
				m++;
			}
		}
		if (m==i) {
			System.out.println("il n y a pas de vehicule dans l agence avec cette marque");
		}
	}
	void selection(double px) {
		int i;
		int m=0;
		for (i=0;i<n;i++) {
			if (t[i].getPrix()<px) {
				t[i].decrisvehicule();
			}
			else {
				m++;
			}
		}
		if (m==i) {
			System.out.println("il n y a pas de vehicule dans l agence avec cette marque");
		}
	}
	void old() {
		int i;
		int x=0;
		for (i=1;i<n;i++) {
			if (t[i].getAnnee()<t[x].getAnnee()) {
				x=i;
			}
		}
		t[x].decrisvehicule();
	}
}
