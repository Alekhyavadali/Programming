package cast;
class animal
{
	public void elephant(){
	System.out.println("i am animal");
	
}}
class mammal extends animal{
	public void elephant(){
		System.out.println("i am animal1");	
	}
	public void dog(){
		System.out.println("i am animal2");	
	}
}

public class dogtest {
	public static void main(String[] args){
		animal e=new animal();
		mammal m=(mammal) e;
		m.dog();
		
	}

}
