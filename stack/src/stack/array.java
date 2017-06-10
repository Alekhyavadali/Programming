package stack;
class me{
	char[] a=new char[100];
	void rev(char[] x){
	int	top=-1;
		for(int i=x.length-1;i>=0;i--){
		top=top+1;
		a[top]=x[i];
				System.out.println(a[top]);
	}
	
	}
}
public class array {

	public static void main(String[] args) {
		me m=new me();
		char[] k=new char[]{'a','l','e','k','h','y','a'};
		m.rev(k);
		
		}

	}


