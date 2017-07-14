package factorial;
class fac{
	double facto(double n){
		 if(n==0){
			 return 1;
		 }else{
			 return facto(n-1)* n;
		 }
	 }
}
public class fact {
 
	public static void main(String[] args) {
		fac f=new fac();
		double k=f.facto(100);
System.out.println(k);
	}

	
}
