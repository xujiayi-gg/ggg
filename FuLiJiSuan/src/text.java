import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" ");
			System.out.print("��ѡ��0Ϊ�˳���1Ϊ�㱾Ϣ��2Ϊ�㱾��3Ϊ��Ͷ�ʣ�4Ϊ��n����ʲ���ֵ����");
			int number1 = scanner.nextInt();

			if (number1 == 1) {
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
					System.out.println("����" + year + "���ĸ������㱾ϢΪ��" +(double) (Math.round(money*100)/100.0));
					
				}
				if (number2 == 2) {
					money = money + money * rate * year;
					System.out.println("����" + year + "���ĵ������㱾ϢΪ��" +(double) (Math.round(money*100)/100.0));
				}
				
				

			}

			if (number1 == 2) {
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
					System.out.println("����������Ҫ����ı���Ϊ��" +(double) (Math.round(money*100)/100.0));
				}
				if (number2 == 2) {
					money = money * (1 / (1 + rate * year));
					System.out.println("����������Ҫ����ı���Ϊ��" + (double) (Math.round(money*100)/100.0));
				}

			}
			if (number1 == 3) {

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
					year = Logarithm.log(money2/money1,1+rate);
					year = Math.ceil(year);
					System.out.println("��Ҫ���������Ϊ��" + year);
				} else if (number2 == 2) {
					System.out.print("���������ޣ�");
					int year = scanner.nextInt();
					double rate;
					rate = Math.pow(money2/money1, 1.0/year)-1;
					System.out.println("����������Ϊ��" + (double) (Math.round(rate*10000)/10000.0));
				}
			}
			
			if(number1 == 4){
				System.out.print("������ÿ���Ͷ�ʽ�");
				double money1 = scanner.nextDouble();
				System.out.print("�����������ʣ�");
				double rate = scanner.nextDouble();
				System.out.print("���������ޣ�");
				int year = scanner.nextInt();double money2=0;
				for(int i=1;i<=year;i++){
					
					money1=money1+money2;
					money2=money1*(1+rate);
					
				}
				System.out.println(year+"�����ʲ���ֵΪ��" + (double) (Math.round(money2*100)/100.0));
			}

			if (number1 == 0) {
				System.out.println("ллʹ�ã�" );
				System.exit(0);
				
			}
		} while (true);
	}
}
        

    
  
