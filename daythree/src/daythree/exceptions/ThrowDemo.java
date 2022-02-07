package daythree.exceptions;

import java.io.FileNotFoundException;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo t = new ThrowDemo();
		try {
			t.proc();
		}catch(FileNotFoundException fnfe) {
			System.out.println("Recaught :"+ fnfe);
		}

	}
	//This proc method throws a know exception i.e FileNotFoundException
	void proc() throws FileNotFoundException {
		try {
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException e) {
			System.out.println("Caught Inside demproc");
			throw e;// rethrow the exception
		}
	}

}
