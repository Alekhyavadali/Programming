package search;
class srch{
	void bin(int[] A,int start,int end,int x){
		int mid=(start+end)/2;
		if(start<=end){
			if(x==A[mid]){
				for(int i=start;i<=end;i++){
					if(A[i]==x){
						System.out.println("yes"+" "+i);
					}}}
				
				
			else if(x<A[mid]){
				bin(A,0,mid-1,x);
			}else if(x>A[mid]){
				bin(A,mid+1,end,x);
			}
				
			}}
	
	
		
	}

public class binserch {

	public static void main(String[] args) {
		srch s=new srch();
int[] A=new int[]{2,5,6,7,11,15,20,27,89};
s.bin(A, 0,A.length-1, 89);
	}

}
