package interfaces;
class Car1 {
	  
	 public void goFast(){
		 System.out.println("too slow"); 
	 }
}

class animal extends Car1
{
	public void goFast(){
		 System.out.println("too fast");
	}
 public void dog(){
			 System.out.println("new methd");
		 }
	 }
class override2{
public static void main(String[] args)
{
		Car1 c =new Car1();
	animal d=(animal) c;
	d.dog();
}
}


