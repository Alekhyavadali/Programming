package sorting;
class q{
	int partition(int[] A,int start,int end){
		int pindex=start;
		int pivot=A[end];
		for(int i=start;i<=end-1;i++){
			if(A[i]<=pivot){
			int x=A[i];
			int y=A[pindex];
			A[pindex]=x;
			A[i]=y;
			pindex++;
			}}
				int y=A[pindex];
				
				int x=A[end];
				A[pindex]=x;
				A[end]=y;	
		
	
	return pindex;}
	void qe(int[] A,int start,int end){
	if(start<end){
int k= partition(A,start,end);
	qe(A,start,k-1);
	qe(A,k+1,end);}
	
	}
}
public class quick {

	public static void main(String[] args) {
		int[] A=new int[]{5,2,6,1};
q m=new q();
m.qe(A,0,3);
for(int k:A)
{
	System.out.println(k);
}
	}

}
