import java.io.*;

class deserialization
{
	public static void main(String[] args) throws Exception {


		
		FileInputStream fin = new FileInputStream("sampleTextDoc.txt");

		ObjectInputStream oin = new ObjectInputStream(fin);

		Student1 studObj = (Student1)oin.readObject();

		System.out.println("ID : "+studObj.id+" Name : "+studObj.name);
	}
}