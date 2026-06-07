package _03_Intro_to_Enums;

enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);
	StatesOfMatter(double temp){
		this.celsiusTemp = temp;
	}
	private double celsiusTemp;
	public double convertToFarenheit(double celsius) {
		double farenheitTemp = (celsius*9/5) +32;
		return farenheitTemp;
		
	}
	public double getCelsiusTemp() {
		return celsiusTemp;
	}
}
