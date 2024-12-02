package cisco.java.programs;


//interface Employee{
//    
//    public void getEmployee();
//    public void display();
//}
//interface MNC{
//    
//    public void getMNC();
//    public void display();
//}
//interface Sample extends Employee, MNC{
//    
//}
//public class InterfaceDemo implements Sample {
//    public static void main(String[] args) {
//        
//        Sample d = new InterfaceDemo();
//        d.display();
//        d.getEmployee();
//        d.getMNC();
//        
//    }
//    @Override
//    public void getEmployee() {
//        
//        System.out.println("You are in getEmployee method");
//        
//    }
//    @Override
//    public void display() {
//        
//        System.out.println("You are in display method");
//        
//    }
//    @Override
//    public void getMNC() {
//        
//        System.out.println("You are in MNC method");
//    }
//}

interface Login{
    
    public void getRegister();
    public void getLogin();
    public void display();
}

interface Cart{
    
    public void getPayment();
    public void getWallet();
    public void display();
}

interface Logout{
    public void getLogin();
    public void getOut();
    public void display();
}

interface Dashboard {
    public void getRegister();
    public void getProfile();
    public void display();
}


interface Website extends Login, Cart, Logout, Dashboard{
    
}
public class InterfaceDemo implements Website {
    public static void main(String[] args) {
        
        Website d = new InterfaceDemo();
        d.display();
        d.getLogin();
        d.getPayment();
        d.getOut();
        d.getProfile();
        
    }
    @Override
    public void getLogin() {
        
        System.out.println("You are in Login method");
        
    }
    @Override
    public void display() {
        
        System.out.println("You are in display method");
        
    }
    @Override
    public void getRegister() {
        
        System.out.println("You are in register method");
    }
    @Override
    public void getPayment() {
        
        System.out.println("You are in payment method");
    }
    @Override
    public void getWallet() {
        
        System.out.println("You are in wallet method");
    }
    @Override
    public void getOut() {
        
        System.out.println("You are in out method");
    }
    @Override
    public void getProfile() {
        
        System.out.println("You are in profile method");
    }
	
}
























