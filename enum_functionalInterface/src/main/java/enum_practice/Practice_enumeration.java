package enum_practice;

public class Practice_enumeration {

	public static void main(String[] args) {
		for (Weather weather : Weather.values()) {

			System.out.println("\n" + weather.ordinal() + ". Climate name - " + weather.name() + "\nTemperature - "
					+ weather.getTemp() + "\nDate - " + weather.getDate());
			weather.defaultWeather();

		}
	}

}
