import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��");
		float money = scanner.nextFloat();
		System.out.print("�����������ʣ�");
		float rate = scanner.nextFloat();
		System.out.print("���������ޣ�");
		int year = scanner.nextInt();
		for(int i = 1 ; i<=year; i++){
			money= (1+ rate)*money; 	  
		}
		System.out.print("����"+year+"���ı�ϢΪ��"+money);
	}
}
