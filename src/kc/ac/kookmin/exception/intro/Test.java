package kc.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Trade {
	
	BufferedReader temp;
	
	public void readFile() {
		try {
			String path = Trade.class.getResource("").getPath();
			temp = new BufferedReader(new FileReader(path+"a.txt"));
			
			String s;

		    while ((s = temp.readLine()) != null) {
		    	System.out.println(s);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			close();
		}
	}
	public void close(){
		try {
			temp.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class Test {
    public static void main(String args[]) {
    	Trade a = new Trade();
    	a.readFile();
    }
} 