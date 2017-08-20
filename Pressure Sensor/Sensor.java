class Sensor {

	private double pressure;

	public Sensor(double pressure){
		this.pressure = 0;
	}

	public boolean setPressure(double pressure){
		if (pressure < 0){
			// this.pressure = 0;
			return false;
		}
		else {
			this.pressure = pressure;
			return true;
		}
	}

	public double getPressure(){
		return pressure;
	}
}
