package sorting;
class bub{
	void bubb(int[] x){
		for(int k=0;k<x.length;k++){
		for(int i=0,j=1;j<x.length;i++,j++){
			if(x[j]<x[i]){
				int y=x[i];
				int m=x[j];
				x[j]=y;
				x[i]=m;
			}else{
				continue;
			}
		}
		}for(int i=0;i<x.length;i++){	
			System.out.println(x[i]);		
		}
	}
}
public class bubble {

	public static void main(String[] args) {
int[] m=new int[]{10,5,2,7,4,100};
			bub s=new bub();
			s.bubb(m);
	}

}
