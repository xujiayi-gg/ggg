import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class textTest {

	text cal;
	private Object[] ture;

	@Before
	public void setUp() throws Exception {
		cal = new text();
	}

	@Test
	public void testBenxiFuli() {
		double money = 1000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		int year = 10;
//		int year = 10;
		for (int i = 1; i <= year; i++) {
			money = (1 + rate) * money;
		}
		Assert.assertEquals(1343.92, money, 0.0);
	}
	

	@Test
	public void testBenxiDanli() {
		double money = 1000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		int year = 10;
//		int year = 0;
		money = money + money * rate * year;
		Assert.assertEquals(1300.0, money, 1.0);
	}

	@Test
	public void testBenjinFuli() {
		double money = 1000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		int year = 10;
//		int year = 0;
		double num = 1;
		for (int i = 1; i <= year; i++) {
			num = num * (1 + rate);
		}
		money = money * (1 / num);
		Assert.assertEquals(744.09, money, 1.0);
	}

	@Test
	public void testBenjinDanli() {
		double money = 1000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		int year = 10;
//		int year = 0;
		double num = 1;
		money = money * (1 / (1 + rate * year));
		Assert.assertEquals(769.23, money, 1.0);
	}

	@Test
	public void testTouziRate() {
		double money1 = 1000;
//		double money1 = 0;
		double money2 = 2000;
//		double money2 = 0;
		double year = 10;
//		double year = 0;
		double rate = Math.pow(money2 / money1, 1.0 / year) - 1;
		Assert.assertEquals(0.0718, rate, 0.01);

	}

	@Test
	public void testTouziYear() {
		double money1 = 1000;
//		double money1 = 0;
		double money2 = 2000;
//		double money2 = 0;
		double rate = 0.03;
//		double rate = 0;
		double year;
		year = Logarithm.log(money2 / money1, 1 + rate);
		year = Math.ceil(year);
		Assert.assertEquals(24.0, year, 0.01);

	}

	@Test
	public void YearDingtoushouyi() {
		double money = 1000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		double year = 10;
//		double year = 0;
		double num = 1;
		for (int i = 1; i <= year; i++) {
			num = (1 + rate) * num;

		}
		money = money * (1 + rate) * (-1 + num) / rate;
		Assert.assertEquals(11807.8, money, 1.0);

	}

	@Test
	public void MonthDingtoushouyi() {
		double money = 1000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		double year = 10;
//		double year = 0;
		double num = 1;
		for (int i = 1; i <= year * 12; i++) {
			num = (1 + (rate / 12)) * num;

		}
		money = money * (1 + (rate / 12)) * (-1 + num) / (rate / 12);
		Assert.assertEquals(140090.77, money, 1.0);

	}

	@Test
	public void Dengerbenxihuanknan() {
		double money = 100000;
//		double money = 0;
		double rate = 0.03;
//		double rate = 0;
		double year = 10;
//		double year = 0;
		double num = 1;
		for (int i = 1; i <= year * 12; i++) {
			num = (1 + (rate / 12)) * num;

		}
		money = money * ((rate / 12) * num) / (num - 1);
		Assert.assertEquals(965.61, money, 1.0);

	}

}
