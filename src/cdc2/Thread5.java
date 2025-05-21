package cdc2;
public class Thread5 extends Thread{
     String s;
    	 public Thread5(String name) {
    		 s=name;
    	 }
    	 public void run() {
    		 if(Thread.currentThread().isDaemon()) {
    			 System.out.println(s + "is Daemon Thread");
    		 }
    		 else {
    			 System.out.println(s + "is User Thread");
    		 }
    	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread5 thread1=new Thread5("thread1");
     Thread5 thread2=new Thread5("thread2");
     Thread5 thread3=new Thread5("thread3");
     thread1.setDaemon(true);
     
     thread1.start();
     thread2.start();
     thread3.setDaemon(false);//set user thread1 to Daemon
     thread3.start();//starting thread3
	}
}
