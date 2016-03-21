import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("    1.算本息                          ");
			System.out.println("    2.算本金                          ");
			System.out.println("    3.算投资年限或年利率      ");
			System.out.println("    4.定投收益                       ");
			System.out.println("    5.每月等额本息还款          ");
			System.out.println("    0.退出                             ");
			System.out.println("----------------------------");
			System.out.print("请选择：");
			int number = scanner.nextInt();
			switch (number) {
			case 1:
				Benxi();
				break;
			case 2:
				Benjin();
				break;
			case 3:
				Touzi();
				break;
			case 4:
				Dingtoushouyi();
				break;
			case 5:
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

	private static void Dingtoushouyi() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);

		System.out.print("请选择（1为每年定投，2为每月定投）：");
		int number2 = scanner.nextInt();
		if (number2 == 1) {
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
		} else if (number2 == 2) {
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

	}

	private static void Touzi() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入投资金额：");
		double money1 = scanner.nextDouble();
		System.out.print("请输入收获金额：");
		double money2 = scanner.nextDouble();

		System.out.print("请选择（1为算时间，2为算利率）：");
		int number2 = scanner.nextInt();

		if (number2 == 1) {
			System.out.print("请输入年利率：");
			double rate = scanner.nextDouble();
			double year;
			year = Logarithm.log(money2 / money1, 1 + rate);
			year = Math.ceil(year);
			System.out.println("需要存入的年限为：" + year);
		} else if (number2 == 2) {
			System.out.print("请输入年限：");
			int year = scanner.nextInt();
			double rate;
			rate = Math.pow(money2 / money1, 1.0 / year) - 1;
			System.out.println("所需年利率为："
					+ (double) (Math.round(rate * 10000) / 10000.0));

		}

	}

	private static void Benjin() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本息：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();

		System.out.print("请选择（1为复利计算，2为单利计算）：");
		int number2 = scanner.nextInt();

		if (number2 == 1) {
			double num = 1;
			for (int i = 1; i <= year; i++) {
				num = num * (1 + rate);
			}
			money = money * (1 / num);
			System.out.println("复利计算需要存入的本金为："
					+ (double) (Math.round(money * 100) / 100.0));
		}
		if (number2 == 2) {
			money = money * (1 / (1 + rate * year));
			System.out.println("单利计算需要存入的本金为："
					+ (double) (Math.round(money * 100) / 100.0));

		}

	}

	private static void Benxi() {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金：");
		double money = scanner.nextDouble();
		System.out.print("请输入年利率：");
		double rate = scanner.nextDouble();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();

		System.out.print("请选择（1为复利计算，2为单利计算）：");
		int number2 = scanner.nextInt();

		if (number2 == 1) {
			for (int i = 1; i <= year; i++) {
				money = (1 + rate) * money;
			}
			System.out.println("存入" + year + "年后的复利计算本息为："
					+ (double) (Math.round(money * 100) / 100.0));

		}
		if (number2 == 2) {
			money = money + money * rate * year;
			System.out.println("存入" + year + "年后的单利计算本息为："
					+ (double) (Math.round(money * 100) / 100.0));

		}

	}
}