package com.maven.SpringJunitApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.maven.SpringJunitApp.model.PromoCode;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	PromoCode promoCode;
	
	@TempDir
	Path tempath;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest()
    {
        super();
        promoCode=new PromoCode();
    }
    
    /*@Test
    public void AppTestAgain() {
    	int expectedcabfare=500;
    	int actualcabfare=700;
    	assertEquals(expectedcabfare, actualcabfare);
    }*/
    
    @BeforeAll
    public static void initAll() {
    	System.out.println("MtTestAnnotation:beforeAll");
    }
    
    @BeforeEach
    public void checkAmount() {
    	System.out.println("check Amount");
    }

    @Test
    public void testPromoCode() {
    	//assertTrue(promoCode.checkPromoCode("xingo"));//works
    	assertEquals(true, promoCode.checkPromoCode("bingo"));//works
    }
    
    @Test
    public void testDiscount() {
    	String pcode="JUMBO";
    	double expectedDiscount=0.40;
    	assertEquals(expectedDiscount, promoCode.getDiscount(pcode));
    }
    
    @Test
    @Disabled
    public void testAmountDiscount() {
    	String pcode="TRYNEW90";
    	double amount=1000;
    	double exptectedAmount=950.0;//correct is 100.0
    	assertEquals(exptectedAmount, promoCode.getAmountAfterDiscount(pcode, amount));
    }
    
    @Test
    public void testAmountDiscountandTaxes() {
    	//String pcode="SUNDAY";
    	String pcode=null;
    	double amount=2000;
    	double expectedAmount=1181.0;//correst is 1180.0
    	assertEquals(expectedAmount, promoCode.getAmountAfterDiscountwithTaxes(pcode, amount));
    }
    
    @AfterEach
    public void afterTest() {
    	System.out.println("After each test ");
    }

    @Test
    public void myTest1() {
    	System.out.println("Checking test method");
    	fail("test case failed");
    }
    
    public void testWriter() {
    	//final Path filedir=Files.createFile(tempath, tempath.resolve("myfile.txt"));
    	//Files.writ
    }
    
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	@Test
	public void myTest() {
		System.out.println("Checking test method");
		fail("test case failed");
	}
}