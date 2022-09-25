package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	MotorBike() { // calling the other constructor written below, no argmt constructor
		this(5);
	}

	MotorBike(int speed) { // constructor
		this.speed = speed;
	}

	public int getSpeed() { // getter (use source code to get)
		return speed;
	}

	public void setSpeed(int speed) { // setter (use source code)
		if (speed > 0); // logic
		this.speed = speed;

	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);

	}

	void start() {
		System.out.println("Bike Started");

	}

}
