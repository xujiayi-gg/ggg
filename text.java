import java.util.Scanner;

public class text {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("��ѡ��1Ϊ�㱾Ϣ��2Ϊ�㱾�𣩣�");
		int number1 = scanner.nextInt();
		if (number1 == 1) {
			System.out.print("�����뱾��");
			float money = scanner.nextFloat();
			System.out.print("�����������ʣ�");
			float rate = scanner.nextFloat();
			System.out.print("���������ޣ�");
			int year = scanner.nextInt();
			System.out.print("��ѡ��1Ϊ�������㣬2Ϊ�������㣩��");
			int number2 = scanner.nextInt();
			if (number2 == 1) {
				for (int i = 1; i <= year; i++) {
					money = (1 + rate) * money;
				}
				System.out.println("����" + year + "���ĸ������㱾ϢΪ��" + money);
			}
			if (number2 == 2) {
				money = money + money * rate * year;
				System.out.println("����" + year + "���ĵ������㱾ϢΪ��" + money);
			}

		}

		if (number1 == 2) {
			System.out.print("�����뱾Ϣ��");
			float money = scanner.nextFloat();
			System.out.print("�����������ʣ�");
			float rate = scanner.nextFloat();
			System.out.print("���������ޣ�");
			int year = scanner.nextInt();
			System.out.print("��ѡ��1Ϊ�������㣬2Ϊ�������㣩��");
			int number2 = scanner.nextInt();
			if (number2 == 1) {
				float num = 1;
				for (int i = 1; i <= year; i++) {
					num = num * (1 + rate);
				}
				money = money * (1 / num);
				System.out.println("����������Ҫ����ı���Ϊ��" + money);
			}
			if (number2 == 2) {
				money = money * (1 / (1 + rate * year));
				System.out.println("����������Ҫ����ı���Ϊ��" + money);
			}

		}

	}
}
