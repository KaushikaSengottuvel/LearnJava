package learnLocalozation;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Localization {
	Scanner scan = new Scanner(System.in);

	private void resourceBundle(Locale l) {

		ResourceBundle resource = ResourceBundle.getBundle("lang", l);
		System.out.println(resource.getString("languagechosen"));
		System.out.println(resource.getString("typeamount"));
		double k = scan.nextDouble();
		NumberFormat nformat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(resource.getString("enteredamountis") + nformat.format(k));

	}

	private void chooseOption() {

	}

	public static void main(String[] args) {
		Localization obj = new Localization();

		Locale germany = new Locale("de", "DE");
		obj.chooseOption();

		obj.resourceBundle(germany);

	}

}
