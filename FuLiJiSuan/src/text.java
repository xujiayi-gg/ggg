import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("    1.�������㱾Ϣ                          ");
			System.out.println("    2.�������㱾Ϣ                          ");
			System.out.println("    3.�������㱾��                          ");
			System.out.println("    4.�������㱾��                          ");
			System.out.println("    5.��Ͷ������      ");
			System.out.println("    6.��Ͷ��������      ");
			System.out.println("    7.ÿ�궨Ͷ����                       ");
			System.out.println("    8.ÿ�¶�Ͷ����                       ");
			System.out.println("    9.ÿ�µȶϢ����          ");
			System.out.println("    0.�˳�                             ");
			System.out.println("----------------------------");
			System.out.print("��ѡ��");
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
				System.out.println("�������!����������!");
				break;
			}
			}
		}

	}

	private static void Exit() {
		// TODO �Զ����ɵķ������
		System.out.println("ллʹ�ã�");
		System.exit(0);

	}

	private static void Dengerbenxihuanknan() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year * 12; i++) {
			num = (1 + (rate / 12)) * num;

		}
		money = money * ((rate / 12) * num) / (num - 1);
		System.out.println("ÿ�µȶϢ���"
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void MonthDingtoushouyi() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ÿ�µĶ�Ͷ��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year * 12; i++) {
			num = (1 + (rate / 12)) * num;

		}
		money = money * (1 + (rate / 12)) * (-1 + num) / (rate / 12);
		System.out.println("��Ͷ" + year + "�����ʲ���ֵΪ��"
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void YearDingtoushouyi() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ÿ���Ͷ�ʽ�");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year; i++) {
			num = (1 + rate) * num;

		}
		money = money * (1 + rate) * (-1 + num) / rate;
		System.out.println("��Ͷ" + year + "�����ʲ���ֵΪ��"
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void TouziRate() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ͷ�ʽ�");
		double money1 = scanner.nextDouble();
		System.out.print("�������ջ��");
		double money2 = scanner.nextDouble();

		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		double rate;
		rate = Math.pow(money2 / money1, 1.0 / year) - 1;
		System.out.println("����������Ϊ��"
				+ (double) (Math.round(rate * 10000) / 10000.0));

	}

	private static void TouziYear() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ͷ�ʽ�");
		double money1 = scanner.nextDouble();
		System.out.print("�������ջ��");
		double money2 = scanner.nextDouble();

		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		double year;
		year = Logarithm.log(money2 / money1, 1 + rate);
		year = Math.ceil(year);
		System.out.println("��Ҫ���������Ϊ��" + year);

	}

	private static void BenjinDanli() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾Ϣ��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		money = money * (1 / (1 + rate * year));
		System.out.println("����������Ҫ����ı���Ϊ��"
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void BenjinFuli() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾Ϣ��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		double num = 1;
		for (int i = 1; i <= year; i++) {
			num = num * (1 + rate);
		}
		money = money * (1 / num);
		System.out.println("����������Ҫ����ı���Ϊ��"
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void BenxiDanli() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		money = money + money * rate * year;
		System.out.println("����" + year + "���ĵ������㱾ϢΪ��"
				+ (double) (Math.round(money * 100) / 100.0));

	}

	private static void BenxiFuli() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		for (int i = 1; i <= year; i++) {
			money = (1 + rate) * money;
		}
		System.out.println("����" + year + "���ĸ������㱾ϢΪ��"
				+ (double) (Math.round(money * 100) / 100.0));

	}
}