package poly;

class Baap { 
  
 
public class Beta extends Baap {     
 
public int h = 44;    
public void getH() {        
System.out.println("Beta " + h);     }    
 
public static void main(String[] args) {   
       
Baap b = new Beta();
b.getH();
Beta k=(Beta)b;
}}
                          