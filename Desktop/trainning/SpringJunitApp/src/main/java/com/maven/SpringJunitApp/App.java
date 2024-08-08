package com.maven.SpringJunitApp;

import com.maven.SpringJunitApp.model.PromoCode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PromoCode promoCode=new PromoCode();
        System.out.println(promoCode.getDiscount("JUMBO"));
        System.out.println(promoCode.getAmountAfterDiscount("TRYNEW90",1000));
        System.out.println(promoCode.getAmountAfterDiscountwithTaxes("SUNDAY",2000));
    }
}
