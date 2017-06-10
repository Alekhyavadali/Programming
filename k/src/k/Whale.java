package k;
class stack{
	int top=-1;
	int[] a=new int[10];
	void push(int x){
	top=top+1;
	a[top]=x;
	}
	void pop(int y){
	top=top-1;
	
	}
}
public class Whale {
	
	 public static void main(String args[]) {
		 
		 stack c=new stack();
		 c.push(9);
		 c.push(10);
		 c.pop(10);
		 for(int i=0;i<=c.top;i++){
	            System.out.print(c.a[i]+ " ");
	        }
		 
	 }}