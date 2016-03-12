import java.util.Scanner;

public class text {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("请选择（1为算本息，2为算本金）：");
		int number1 = scanner.nextInt();
		if (number1 == 1) {
			System.out.print("请输入本金：");
			float money = scanner.nextFloat();
			System.out.print("请输入年利率：");
			float rate = scanner.nextFloat();
			System.out.print("请输入年限：");
			int year = scanner.nextInt();
			System.out.print("请选择（1为复利计算，2为单利计算）：");
			int number2 = scanner.nextInt();
			if (number2 == 1) {
				for (int i = 1; i <= year; i++) {
					money = (1 + rate) * money;
				}
				System.out.println("存入" + year + "年后的复利计算本息为：" + money);
			}
			if (number2 == 2) {
				money = money + money * rate * year;
				System.out.println("存入" + year + "年后的单利计算本息为：" + money);
			}

		}

		if (number1 == 2) {
			System.out.print("请输入本息：");
			float money = scanner.nextFloat();
			System.out.print("请输入年利率：");
			float rate = scanner.nextFloat();
			System.out.print("请输入年限：");
			int year = scanner.nextInt();
			System.out.print("请选择（1为复利计算，2为单利计算）：");
			int number2 = scanner.nextInt();
			if (number2 == 1) {
				float num = 1;
				for (int i = 1; i <= year; i++) {
					num = num * (1 + rate);
				}
				money = money * (1 / num);
				System.out.println("复利计算需要存入的本金为：" + money);
			}
			if (number2 == 2) {
				money = money * (1 / (1 + rate * year));
				System.out.println("单利计算需要存入的本金为：" + money);
			}

		}

	}
}
