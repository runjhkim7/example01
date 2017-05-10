package org.opentutorials.javatutorials.interfaces.example2;

public class Calculator implements Calculatable {
	int first, second, third;

	@Override
	public void setOprands(int first, int second, int third) {
		// TODO Auto-generated method stub
        this.first = first;
        this.second = second;
        this.third = third;

	}

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return this.first + this.second + this.third;
	}

	@Override
	public int avg() {
		// TODO Auto-generated method stub
		return (this.first + this.second + this.third)/3;
	}

}
