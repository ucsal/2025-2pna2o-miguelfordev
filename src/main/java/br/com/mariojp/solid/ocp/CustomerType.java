package br.com.mariojp.solid.ocp;

public enum CustomerType {
	
	REGULAR(new RegularPolicy()),
	PREMIUM(new PremiumPolicy()), 
	PARTNER(new PartnerPolicy()),
	MEMBER(new MemberPolicy());
	
	private final iDiscountPolicy policy;
	
	CustomerType(iDiscountPolicy policy){
		this.policy = policy;
	}
	
	public double apply(double amount) {
		return policy.apply(amount);
	}
	
}
