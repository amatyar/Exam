package NewExam;

import java.io.FileWriter;

public class Exam8812 {

	public static void main(String[] args) {
		// Define a program to write a text file
		String NoteBook = "MyReader.txt";

		try {
			FileWriter wr = new FileWriter(NoteBook);
			wr.write("Hello from our station.\n");
			wr.write("we are working hard for next level of our futur.\n");
			wr.write("Hope we are getting better for challeneg.\n");
			wr.write("Have good Day.");
			wr.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			System.out.println(" we are closing connection");
		}
	}

}
