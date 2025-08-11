package lab08;

public class RacingCar extends Car {
	private String driver;
	private int turboFactor;

	public RacingCar(String model, int speed, String Driver, int turboFactor) {
		super(model, speed);
		setDriver(Driver);
		setTurboFactor(turboFactor);
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		setSpeed(getSpeed() * getTurboFactor());
	}

	
	
}
