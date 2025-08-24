package br.com.mariojp.solid.ocp;

public class PremiumPolicy implements iDiscountPolicy{

	public double apply(double amount) {
		return amount * 0.90;
	}

}
