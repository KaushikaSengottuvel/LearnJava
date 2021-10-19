package learnFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class learnFileAccess {

	public static void main(String[] args) {
		Path path = Paths
				.get("C:\\Users\\Karthick Subramanian\\Desktop\\JAVA\\Problems\\Exercise_problem\\textfile.txt");

		if (Files.exists(path)) {
			try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("US-ASCII"))) {

				Files.lines(path).forEach(System.out::println);
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

		else {
			System.out.println("Path Doesnt exist");
		}

		Path path1 = Paths.get(
				"C:\\\\Users\\\\Karthick Subramanian\\\\Desktop\\\\JAVA\\\\Problems\\\\Exercise_problem\\\\sampleLog.log");

		if (Files.exists(path1)) {

			try {
				Files.lines(path1).filter(s -> s.contains("WARN")).forEach(System.out::println);
				System.out.println("File Owner Name : " + Files.getOwner(path1).getName());

				// to modify - use attribute view.
				BasicFileAttributeView view = Files.getFileAttributeView(path1, BasicFileAttributeView.class);

				// to just view/ read - use attribute.
				BasicFileAttributes attributes = view.readAttributes();

				System.out.println("Last Modified Name : " + attributes.lastModifiedTime());

//				System.out.println("Modified owner name : " + view.);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Path1 Doesnt exist");
		}
	}

}
