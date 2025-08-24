package br.com.mariojp.solid.ocp;

public class RegularPolicy implements iDiscountPolicy{

	public double apply(double amount) {
		return amount * 0.95;
	}

}
