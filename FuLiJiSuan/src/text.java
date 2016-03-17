import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" ");
			System.out.print("请选择（0为退出，1为算本息，2为算本金，3为算投资，4为算n年后资产总值）：");
			int number1 = scanner.nextInt();

			if (number1 == 1) {
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
					System.out.println("存入" + year + "年后的复利计算本息为：" +(double) (Math.round(money*100)/100.0));
					
				}
				if (number2 == 2) {
					money = money + money * rate * year;
					System.out.println("存入" + year + "年后的单利计算本息为：" +(double) (Math.round(money*100)/100.0));
				}
				
				

			}

			if (number1 == 2) {
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
					System.out.println("复利计算需要存入的本金为：" +(double) (Math.round(money*100)/100.0));
				}
				if (number2 == 2) {
					money = money * (1 / (1 + rate * year));
					System.out.println("单利计算需要存入的本金为：" + (double) (Math.round(money*100)/100.0));
				}

			}
			if (number1 == 3) {

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
					year = Logarithm.log(money2/money1,1+rate);
					year = Math.ceil(year);
					System.out.println("需要存入的年限为：" + year);
				} else if (number2 == 2) {
					System.out.print("请输入年限：");
					int year = scanner.nextInt();
					double rate;
					rate = Math.pow(money2/money1, 1.0/year)-1;
					System.out.println("所需年利率为：" + (double) (Math.round(rate*10000)/10000.0));
				}
			}
			
			if(number1 == 4){
				System.out.print("请输入每年的投资金额：");
				double money1 = scanner.nextDouble();
				System.out.print("请输入年利率：");
				double rate = scanner.nextDouble();
				System.out.print("请输入年限：");
				int year = scanner.nextInt();double money2=0;
				for(int i=1;i<=year;i++){
					
					money1=money1+money2;
					money2=money1*(1+rate);
					
				}
				System.out.println(year+"年后的资产总值为：" + (double) (Math.round(money2*100)/100.0));
			}

			if (number1 == 0) {
				System.out.println("谢谢使用！" );
				System.exit(0);
				
			}
		} while (true);
	}
}
        

    
  
