package poly;
class p1{
	void m1(){
		System.out.println("hello");
	}
		void m3(){
			System.out.println("hello123");	
		}
		
	}

class p2 extends p1{
	void m1(){
		System.out.println("bye");
	
	}
	void m2(){
		System.out.println("bye for now");
		
	}
	
	
}
public class poly {

	public static void main(String[] args) {
 p1 p=new p2();
 p.m1();
 int [] a={6,8,7,9,5,2};
String s="alekhya";
String[] ary = s.split("");
for(int x= 0; x<ary.length; x++)
{
	System.out.println(ary[x]);
}
	
	}
}


