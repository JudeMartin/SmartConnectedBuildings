package DataParser;

public class RawSensorDataConverter {

	/* Raw RH Sensor Value */
	public double RawRHSensorValueConverter(int rawRHSensorValue) {

		if ((rawRHSensorValue < Integer.MIN_VALUE) && (rawRHSensorValue > Integer.MAX_VALUE)) {
			System.out.println("Please Enter a Valid rawSensorValue,Thanks!");
			return 0;
		}
		/* http://www.phidgets.com/docs/1125_User_Guide */
		double parsedRHSensorValue = ((rawRHSensorValue * 0.1906) - 40.2);

		System.out.println("The Raw RH Sensor Value is: " + rawRHSensorValue);
		System.out.println("The Parsed RH Sensor Value is: " + parsedRHSensorValue);

		return parsedRHSensorValue;

	}
	/* Raw Temperature Sensor Value */
	public double RawTemperatureSensorValueConverter(int rawTemperatureSensorValue){
		
		if ((rawTemperatureSensorValue < Integer.MIN_VALUE) && (rawTemperatureSensorValue > Integer.MAX_VALUE)) {
			System.out.println("Please Enter a Valid rawSensorValue,Thanks!");
			return 0;
		}
		
		/* http://www.phidgets.com/docs/1129_User_Guide */
		double parsedTemperatureValue = ((rawTemperatureSensorValue * 0.22222) - 61.11);

		System.out.println("The Raw Temperature Sensor Value is : " + rawTemperatureSensorValue);
		System.out.println("The Parsed Temperature Sensor Value is: " + parsedTemperatureValue);
		
		return parsedTemperatureValue;
	}
}
