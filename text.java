import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金：");
		float money = scanner.nextFloat();
		System.out.print("请输入年利率：");
		float rate = scanner.nextFloat();
		System.out.print("请输入年限：");
		int year = scanner.nextInt();
		for(int i = 1 ; i<=year; i++){
			money= (1+ rate)*money; 	  
		}
		System.out.print("存入"+year+"年后的本息为："+money);
	}
}
