package poly;
  class Order { 
	  static String result = ""; 
	  { result += "c"; } 
	  static 
	  { result += "u"; } 
	  { result += "r"; } 
	  }

	 public class poly1 { 
	public static void main(String[] args) { 
		System.out.print(Order.result + " "); 
		System.out.print(Order.result + " "); 
		new Order(); 
		new Order(); 
		System.out.print(Order.result + " "); 
		System.out.println(3 + 100/10*2-13);
		} 
	} 
