import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("    1.�㱾Ϣ                          ");
			System.out.println("    2.�㱾��                          ");
			System.out.println("    3.��Ͷ�����޻�������      ");
			System.out.println("    4.��Ͷ����                       ");
			System.out.println("    5.ÿ�µȶϢ����          ");
			System.out.println("    0.�˳�                             ");
			System.out.println("----------------------------");
			System.out.print("��ѡ��");
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

	private static void Dingtoushouyi() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ѡ��1Ϊÿ�궨Ͷ��2Ϊÿ�¶�Ͷ����");
		int number2 = scanner.nextInt();
		if (number2 == 1) {
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
		} else if (number2 == 2) {
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

	}

	private static void Touzi() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ͷ�ʽ�");
		double money1 = scanner.nextDouble();
		System.out.print("�������ջ��");
		double money2 = scanner.nextDouble();

		System.out.print("��ѡ��1Ϊ��ʱ�䣬2Ϊ�����ʣ���");
		int number2 = scanner.nextInt();

		if (number2 == 1) {
			System.out.print("�����������ʣ�");
			double rate = scanner.nextDouble();
			double year;
			year = Logarithm.log(money2 / money1, 1 + rate);
			year = Math.ceil(year);
			System.out.println("��Ҫ���������Ϊ��" + year);
		} else if (number2 == 2) {
			System.out.print("���������ޣ�");
			int year = scanner.nextInt();
			double rate;
			rate = Math.pow(money2 / money1, 1.0 / year) - 1;
			System.out.println("����������Ϊ��"
					+ (double) (Math.round(rate * 10000) / 10000.0));

		}

	}

	private static void Benjin() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾Ϣ��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();

		System.out.print("��ѡ��1Ϊ�������㣬2Ϊ�������㣩��");
		int number2 = scanner.nextInt();

		if (number2 == 1) {
			double num = 1;
			for (int i = 1; i <= year; i++) {
				num = num * (1 + rate);
			}
			money = money * (1 / num);
			System.out.println("����������Ҫ����ı���Ϊ��"
					+ (double) (Math.round(money * 100) / 100.0));
		}
		if (number2 == 2) {
			money = money * (1 / (1 + rate * year));
			System.out.println("����������Ҫ����ı���Ϊ��"
					+ (double) (Math.round(money * 100) / 100.0));

		}

	}

	private static void Benxi() {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��");
		double money = scanner.nextDouble();
		System.out.print("�����������ʣ�");
		double rate = scanner.nextDouble();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();

		System.out.print("��ѡ��1Ϊ�������㣬2Ϊ�������㣩��");
		int number2 = scanner.nextInt();

		if (number2 == 1) {
			for (int i = 1; i <= year; i++) {
				money = (1 + rate) * money;
			}
			System.out.println("����" + year + "���ĸ������㱾ϢΪ��"
					+ (double) (Math.round(money * 100) / 100.0));

		}
		if (number2 == 2) {
			money = money + money * rate * year;
			System.out.println("����" + year + "���ĵ������㱾ϢΪ��"
					+ (double) (Math.round(money * 100) / 100.0));

		}

	}
}