package theoryJava.fileManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManageFile {

	/* **************************** WRITE TO FILE *************************** */
	public void	writeToFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Hello from outside!");
			writer.write("\nHow is it going?");
			writer.close();			//Close makes the write() happen.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* *************************** READ FROM FILE *************************** */
	public void	readFromFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			System.out.println(reader.readLine());
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
