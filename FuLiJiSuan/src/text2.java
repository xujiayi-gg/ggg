import java.util.Scanner;

public class text2 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾Ϣ��");
		float money = scanner.nextFloat();
		System.out.print("�����������ʣ�");
		float rate = scanner.nextFloat();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		float money1 = 0;
		float money2 = 0;
		money1=money;
		float num=1;
		for(int i = 1 ; i<=year; i++){			
			num = num*(1+rate);			 
		}
		money1= money1*(1/num);
		System.out.println("����������Ҫ����ı���Ϊ��"+money1);
		money2=money*(1/(1+rate*year));
		System.out.println("����������Ҫ����ı���Ϊ��"+money2);
	}

}
