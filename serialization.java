import java.io.*;

class serialization
{
	public static void main(String[] args) throws IOException{
		
		Student1 s1 = new Student1(005, "Imaiyal");

		FileOutputStream fout = new FileOutputStream("sampleTextDoc.txt");

		ObjectOutputStream out = new ObjectOutputStream(fout);


		out.writeObject(s1);

		System.out.println("Success");
	}
}