package sorting;


class mer{
 void me(int[] A){
		int n=A.length;
		if(n<2){
			System.out.println("");
		}
		else
		{
			int m=n/2;
			int[] left=new int[m];
			int[] right=new int[n-m];
		for(int i=0;i<=m-1;i++){
			left[i]=A[i];
			
		}
		for(int i=m;i<=n-1;i++){
			right[i-m]=A[i];
			}
		
		me(left);
		me(right);
		mergesort(left,right,A);
		}
		
		}	
	void mergesort(int[] left,int[] right,int[] A){
	int	n=left.length;
	int m=right.length;
		int k=0,i=0,j=0;
	while(i<n&&j<m){
	
		if(left[i]<right[j]){
			A[k]=left[i];
			i++;
			k++;
		}else{
			A[k]=right[j];
			j++;
			k++;
		}}
		while(i<n){
			if(left[i]<=right[j]){
				A[k]=left[i];
				i++;
				k++;	
			}
			while(j<m){
				A[k]=right[j];
				j++;
				k++;	
			}
		}for(int q:A){
			System.out.print(q);
		}
	}}
public class merge {
public static void main(String[] args){
	mer k=new mer();
	int[] r=new int[]{2,1,3,4,7,5,0};
	k.me(r);
	
}

}