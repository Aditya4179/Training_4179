package com.maven.SpringJunitApp.model;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCode {
	List<String> promoCodes;
	TreeMap<String,Double> promocodeDiscount;
	
	public PromoCode() {
		promoCodes=Arrays.asList("JUMBO","BINGO","HAPPY50","TRYNEW90","SUNDAY");
		promocodeDiscount=new TreeMap<String,Double>();
		promocodeDiscount.put(promoCodes.get(0), 0.40);
		promocodeDiscount.put(promoCodes.get(1), 0.50);
		promocodeDiscount.put(promoCodes.get(2), 0.30);
		promocodeDiscount.put(promoCodes.get(3), 0.90);
		promocodeDiscount.put(promoCodes.get(4), 0.50);
		
	}
	
	public Double getDiscount(String promoCodes) {
		return promocodeDiscount.containsKey(promoCodes)? promocodeDiscount.get(promoCodes):0.05;
	}
	
	public Double getAmountAfterDiscount(String promoCodes, double amount) {
		return promocodeDiscount.containsKey(promoCodes)?(amount-amount*promocodeDiscount.get(promoCodes)):(amount-amount*0.05);
	}
	
	public Double getAmountAfterDiscountwithTaxes(String promoCodes,double amount) {
		double amountAfterDiscount=getAmountAfterDiscount(promoCodes, amount);
		return (amountAfterDiscount+(0.18*amountAfterDiscount));
	}
	
	public boolean checkPromoCode(String promoCode) {
		return promoCodes.contains(promoCode.toUpperCase());
	}

}
