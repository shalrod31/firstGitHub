package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethingElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());

		ducati.start();
		honda.start();

		// ducati.setSpeed(100);
		// honda.setSpeed(150);

		ducati.increaseSpeed(100);

		honda.increaseSpeed(150);

		ducati.decreaseSpeed(50);

		honda.decreaseSpeed(151);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
