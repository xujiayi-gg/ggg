package kxj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FulijisuanTest {

	Fulijisuan cal;
	@Before
	public void setUp() throws Exception {
		cal=new Fulijisuan();
	}

	@Test
	public void testBenjin() {
		double n=30;
		double f=230000;
		double i=0.05;
		double p=(float) (f*1/Math.pow(1+i, n));
		Assert.assertEquals( 53216, p, 1.0);       
	}

	@Test
	public void testNianshu() {
	double f=20000;
	double p=3000;
	double i=0.1;
	double  n=Logarithm.log(f/p,1+i);;
	Assert.assertEquals(20, n, 1.0);    
	}

	@Test
	public void testLilv() {
	double f=300000;
	double p=25000;
	double n=10;
	double i=Math.pow(f/p, 1.0/n)-1;
	Assert.assertEquals(0.282, i, 0.005);  
	}


}
