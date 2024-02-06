import java.io.*;

class B extends Thread{
	public void run(){
		try{
			for(int i = 0; i < 3; i++){
				System.out.println("BMS");
				Thread.sleep(10000);
			}
		} catch (InterruptedException e){
			System.out.println(e);
		}
		
	}
}

class C extends Thread{
	public void run(){
		try{
			for(int i = 0; i < 3; i++){
				System.out.println("CSE");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e){
			System.out.println(e);
		}
		
	}
}

class ThreadMain{
	public static void main(String args[]){
		B b = new B();
		C c = new C();
		b.start();
		c.start();
	}
}
