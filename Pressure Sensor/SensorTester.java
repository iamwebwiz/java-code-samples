import java.util.*;

public class SensorTester {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pressure;

		System.out.println("ENTER VALUE FOR PRESSURE");
		pressure = input.nextDouble();

		Sensor pressureSensor = new Sensor(pressure);
		pressureSensor.setPressure(pressure);

		System.out.println("The pressure you set is " + pressureSensor.getPressure());
	}
}
