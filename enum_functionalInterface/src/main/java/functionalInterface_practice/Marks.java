package functionalInterface_practice;

public class Marks implements CheckInvalidMark {
	private long rollNo;
	private int Tamil, English;

	public Marks(long rollNo, int tamil, int English) {
		this.rollNo = rollNo;
		this.Tamil = tamil;
		this.English = English;
	}

	public long getRollNo() {
		return rollNo;
	}

	public int getTamil() {
		return Tamil;
	}

	public int English() {
		return English;
	}

	@Override
	public void checkInvalidMarkMethod() {

	}

}
