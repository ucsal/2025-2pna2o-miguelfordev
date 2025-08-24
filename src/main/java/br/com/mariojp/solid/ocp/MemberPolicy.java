package br.com.mariojp.solid.ocp;

public class MemberPolicy implements iDiscountPolicy{

	public double apply(double amount) {
		return amount * 0.69;
	}

}
