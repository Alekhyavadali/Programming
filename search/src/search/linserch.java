package search;
class lin{
	void lin(int[] A,int x){
		for(int i=0;i<A.length;i++){
			if(A[i]==x){
				System.out.println("yes"+" "+i);
			}
		}
	}
}
public class linserch {

	public static void main(String[] args) {
		lin l=new lin();
		int[] A=new int[]{3,2,7,5};
		l.lin(A, 5);
		
	}

}
