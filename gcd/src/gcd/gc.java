package gcd;
class gcd{
	int gce(int a,int b){
		if(b==0){
			return a;
		}else
			return gce(b,a%b);
	}
}
public class gc {

	public static void main(String[] args) {
		gcd d=new gcd();
	
	int k=d.gce(70,25);
	System.out.println(k);
	}
}
