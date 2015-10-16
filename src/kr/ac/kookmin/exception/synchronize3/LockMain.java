package kr.ac.kookmin.exception.synchronize3;

public class LockMain {
	public static void main(String arg[]) {
		IntBuffer b = new IntBuffer();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();
	}
}
