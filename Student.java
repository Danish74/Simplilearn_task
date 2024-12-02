package cisco.java.programs;

public class Student {
	
	int age;
	char section, gender;
	int marks1, marks2, marks3;
	
	public Student(int marks1, int marks2, int marks3){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
	
	public Student(int age) {
		this.age = age;
	}
	
	
	
	public s1() {
		float pre = (marks1 + marks2 + marks3)/100;
		return totalPrecentage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


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
