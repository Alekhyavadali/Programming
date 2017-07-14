package sorting;


class mer{
 void me(int[] A,int left,int right,int [] temparray){
		
		if(left<right)
		{
			int centre=(left+right)/2;
			
		
		me(A,left,centre,temparray);
		me(A,centre+1,right,temparray);
		mergesort(A,left,centre+1,right,temparray);
		}
		
		}	
	void mergesort(int[] A,int leftpos,int rightpos,int rightend,int[] temparray){
	int leftend=rightpos-1;
	int temppos=leftpos;
	int nume=rightend-leftpos+1;
	while(leftpos<=leftend&&rightpos<=rightend){
	if(A[leftpos]<A[rightpos])
		temparray[temppos++]=A[leftpos++];
	else
		temparray[temppos++]=A[rightpos++];}
	while(leftpos<=leftend)
		temparray[temppos++]=A[leftpos++];
	while(rightpos<=rightend)
		temparray[temppos++]=A[rightpos++];
	
		for(int i=0;i<nume;i++,rightend--){
			A[rightend]=temparray[rightend];
			System.out.println(temparray[rightend]);}
	
	
	}}
public class merge {
public static void main(String[] args){
	mer k=new mer();
	int[] r=new int[]{2,1,3,4,7,5,0};
	int[] temparray=new int[7];
	k.me(r,0,r.length-1,temparray);
	
}

}