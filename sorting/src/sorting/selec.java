package sorting;
class sel{
	void sele(int[] x){
	for(int i=0;i<x.length;i++){
		for(int j=0;j<x.length;j++){
			if(x[j]<x[i]){
				int y=x[j];
				int k=x[i];
				x[i]=y;
				x[j]=k;
				
			}
			else{
				continue;
			}
		}
	}
	for(int i=x.length-1;i>=0;i--){	
System.out.println(x[i]);		
	}}
}
public class selec {
	public static void main(String[] args){
		int[] m=new int[]{45,23,87,12,9};
		sel s=new sel();
		s.sele(m);
	}
	

}
