package br.com.mariojp.solid.ocp;

public class PartnerPolicy implements iDiscountPolicy{

	public double apply(double amount) {
		return amount * 0.88;
	}

}
