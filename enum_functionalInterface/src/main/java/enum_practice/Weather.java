package enum_practice;

import java.time.LocalDate;

public enum Weather {
	SUNNY(LocalDate.of(2020, 5, 4), 38.0f) {
		@Override
		public void defaultWeather() {
			System.out.println("It's Sunny.");
		}
	},

	RAINY(LocalDate.of(2020, 8, 12), 36.0f),

	WINDY(LocalDate.of(2020, 6, 13), 35.0f),

	SNOWY(LocalDate.of(2020, 12, 2), 30.0f);

	private LocalDate date;
	private float temp;

	private Weather(LocalDate date, float temp) {
		this.date = date;
		this.temp = temp;
	}

	public LocalDate getDate() {
		return date;
	}

	public float getTemp() {
		return temp;
	}

	public void defaultWeather() {
		System.out.println("Weather is Good.");
	}

}
