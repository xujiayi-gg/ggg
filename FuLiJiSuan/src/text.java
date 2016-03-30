import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("    1.复利计算本息                          ");
			System.out.println("    2.单利计算本息                          ");
			System.out.println("    3.复利计算本金                          ");
			System.out.println("    4.单利计算本金                          ");
			System.out.println("    5.算投资年限      ");
			System.out.println("    6.算投资年利率      ");
			System.out.println("    7.每年定投收益                       ");
			System.out.println("    8.每月定投收益                       ");
			System.out.println("    9.每月等额本息还款          ");
			System.out.println("    0.退出                             ");
			System.out.println("----------------------------");
			System.out.print("请选择：");
			int number = scanner.nextInt();
			switch (number) {
			case 1:
				BenxiFuli();
				break;
			case 2:
				BenxiDanli();
				break;
			case 3:
				BenjinFuli();
				break;
			case 4:
				BenjinDanli();
				break;
			case 5:
				TouziYear();
				break;
			case 6:
				TouziRate();
				break;
			case 7:
				YearDingtoushouyi();
				break;
			case 8:
				MonthDingtoushouyi();
				break;
			case 9:
				Dengerbenxihuanknan();
				break;
			case 0:
				Exit();
				break;
			default: {
				System.out.println("输入错误!请重新输入!");
				break;
			}
			}
		}

	}

	private static void Exit() {
		// TODO 自动生成的方法存根
		System.out.println("谢谢使用！");
		System.exit(0);

	}

	private static void Dengerbenxihuanknan() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入贷款本金：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year * 12; i++) {
			num = (1 + (rate / 12)) * num;

		}
		money = money * ((rate / 12) * num) / (num - 1);
		System.out.println("每月等额本息还款："
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void MonthDingtoushouyi() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入每月的定投金额：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year * 12; i++) {
			num = (1 + (rate / 12)) * num;

		}
		money = money * (1 + (rate / 12)) * (-1 + num) / (rate / 12);
		System.out.println("定投" + year + "年后的资产总值为："
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void YearDingtoushouyi() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);

		System.out.print("请输入每年的投资金额：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year; i++) {
			num = (1 + rate) * num;

		}
		money = money * (1 + rate) * (-1 + num) / rate;
		System.out.println("定投" + year + "年后的资产总值为："
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void TouziRate() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入投资金额：");
		double money1 = scanner.nextDouble();
		System.out.print("请输入收获金额：");
		double money2 = scanner.nextDouble();

		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		double rate;
		rate = Math.pow(money2 / money1, 1.0 / year) - 1;
		System.out.println("所需年利率为："
				+ (double) (Math.round(rate * 10000) / 10000.0));

	}

	private static void TouziYear() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入投资金额：");
		double money1 = scanner.nextDouble();
		System.out.print("请输入收获金额：");
		double money2 = scanner.nextDouble();

		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		double year;
		year = Logarithm.log(money2 / money1, 1 + rate);
		year = Math.ceil(year);
		System.out.println("需要存入的年限为：" + year);

	}

	private static void BenjinDanli() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本息：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		money = money * (1 / (1 + rate * year));
		System.out.println("单利计算需要存入的本金为："
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void BenjinFuli() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本息：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year; i++) {
			num = num * (1 + rate);
		}
		money = money * (1 / num);
		System.out.println("复利计算需要存入的本金为："
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void BenxiDanli() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		money = money + money * rate * year;
		System.out.println("存入" + year + "年后的单利计算本息为："
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void BenxiFuli() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		for (int i = 1; i <= year; i++) {
			money = (1 + rate) * money;
		}
		System.out.println("存入" + year + "年后的复利计算本息为："
				+ (double) (Math.round(money * 100) / 100.0));

	}
}