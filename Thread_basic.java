
package cisco.java.programs;
public class Thread_basic extends Thread {
    
    public void run(){
        
        for(int i=1 ;i<4; i++)
        {
            try{
                Thread.sleep(3000); 
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " --> " + i + " ---> " + Thread.currentThread().getState());
        }
        System.out.println(Thread.currentThread().getName() + " :::: " + Thread.currentThread().getState() + " >> " + Thread.currentThread().isAlive() + " >> " + Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        
       Thread_basic t1 = new Thread_basic();
        t1.setName("Java");
        t1.setPriority(MIN_PRIORITY); 
        
        Thread_basic t2 = new Thread_basic();
        t2.setName("Python"); 
        t2.setPriority(NORM_PRIORITY); 
        
        Thread_basic t3 = new Thread_basic();
        t3.setName("HTML");
        t3.setPriority(MAX_PRIORITY); 
        
        Thread_basic t4 = new Thread_basic();
        t4.setName("Oracle"); 
        t4.setPriority(NORM_PRIORITY);   
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}