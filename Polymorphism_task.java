package cisco.java.programs;

public class Polymorphism_task {
	
	class Shape1{
	    int l=10,b=20,bs=30,he=30,s=40,d1=40,d2=30;
	    
	    void diaplay(){
	        System.out.println("The parent class");
	    }
	}
	class Rectangle extends Shape1{
	    void display(){
	        System.out.println(l*b);
	    }
	}
	class Triangle extends Shape1{
	    void display(){
	        System.out.println(he*bs/2);
	    }
	}
	class Square extends Shape1{
	    void display(){
	        System.out.println(s*s);
	    }
	}
	class Rhombus extends Shape1{
	    void display(){
	        System.out.println(d1*d2/2);
	    }
	}
	
	    public static void main(String[] args) {
	        Shape1 shape;

	        shape = new Rectangle(5, 3);
	        shape.area(); 

	        shape = new Square(4);
	        shape.area(); 

	        shape = new Triangle(6, 4);
	        shape.area();

	        shape = new Rhombus(5, 6);
	        shape.area(); 
	    }
	}


