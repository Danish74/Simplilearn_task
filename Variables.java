package cisco.java.programs;

//public class Variables {
//	
//	public void area(int length, int breath) {
//		
//		int result = length * breath;
//		System.out.println("The area is :" + result);
//		
//	}
//
//	public static void main(String[] args) {
//		
//		
//		
//		Variables v = new Variables();
//		v.area(20, 40);
//		
//
//	}
//
//}
public class Variables {
    
    int length, breadth, a;  // class variables
    float radius;
    
    public Variables(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public Variables(float radius){  
        this.radius = radius;
    }
    
    public Variables(int a){  
        this.a = a;
    }
    
    public void rectangle(){
        int rectangle = length * breadth;
        System.out.println("The area of rectangle :" + rectangle);
        
    }
    
    public void circle(){
    	float circle = 3.14f*radius*radius;
        System.out.println("The area of circle :" + circle);
        
    }
    
    public void square(){
    	int result = a*a;
        
        System.out.println("The area of square :" + result);
        
    }
    
    
    public static void main(String[] args) {
        
        Variables v1 = new Variables(10, 20);  // objects should be created inside the main method/ launcher method
        
        Variables v2 = new Variables(20);
        
        Variables v3 = new Variables(5.4f);
        
        v1.rectangle();
        v2.square();
        v3.circle();
        
    }
}





























