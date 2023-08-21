package NewExam;

public class Exam8_20_1 {

	public static void main(String[] args) {
		DataBase db = DataBase.getInstance();
		db.getConnection();

	}

}

class DataBase {
	private static DataBase obj;

	private DataBase() {
	}

	public static DataBase getInstance() {
		if (obj == null) {
			obj = new DataBase();
		}
		return obj;
	}

	public void getConnection() {
		System.out.println(" you are conneting singleton Database");
	}
}