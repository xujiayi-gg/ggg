package kxj;
import java.util.Scanner;

public class Fulijisuan {
	 public static double p,i,f ;
	 public static double n;
	 public static int a=0;
	 
	 static double A[]  = new double[10];
		static double B[]  = new double[10];
		static double C[]  = new double[10];
		static double D[]  = new double[10];
	 
	 //���㱾��
	public static void Benjin(){
		//int n;
		//float f,i,p;
		boolean flag;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	 if(n>=0)
	 	 {
	 		 if(i>=0&&i<=1)
	 		 {
	 		    flag=true;
	 		    p=(float) (f*1/Math.pow(1+i, n));
	 		 }
	 		 else
	 		 {
	 			 System.out.println("������������д�");
	 			 flag=false;
	 			 
	 		 }
	 	 }
	 	 else
	 	 {
	 		 System.out.println("����������д�");
	 		 flag=false;
	 	     
	 	 }
	 	 if(flag)
	 		 System.out.println("����Ϊ�� "+(double)(Math.round(p*100)/100.0));
	
	}
	
	//���㱾Ϣ��
	public static void Benxihe(){
		 double sum1=0,sum2=0;
		 boolean flag;
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	if(n>=0)
	 	 {
	 		 if(i>=0&&i<=1)
	 		 {
	 		     sum1=(float) (p*Math.pow(1+i, n));
	 		 	 sum2=p*(1+i*n);
	 		 	 flag=true;
	 		 	 
	 		 }
	 		 else
	 		 {
	 			 System.out.println("������������д�");
	 			 flag=false;
	 			 
	 		 }
	 	 }
	 	 else
	 	 {
	 		 System.out.println("����������д�");
	 		 flag=false;
	 	     
	 	 }
	 	 if(flag)
	 	 {
	 	    System.out.println("�����ı�Ϣ��Ϊ�� "+(double)(Math.round(sum1*100)/100.0));
	 	    System.out.println("�����ı�Ϣ��Ϊ�� "+(double)(Math.round(sum2*100)/100.0));
	 	 }
	}
	
	//��������
	public static void Nianshu(){
		boolean flag;
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	if(i>=0&&i<=1)
		 {
		 	n=Logarithm.log(f/p,1+i); 
		 	flag=true;
		 }
		 else
		 {
			System.out.println("������������д�"); 
			flag=false;

		 }
	 	if(flag)
	 	 System.out.println("��Ҫ�������Ϊ: "+Math.ceil(n));	 
	}
	
	//����������
	public static void Lilv(){
		boolean flag;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("��������ֵ: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	if(n>=0)
	 	 {
	 		 i=Math.pow(f/p, 1.0/n)-1;
	 		 flag=true;
	 	 }
	 	 else
	 	 {
	 		 System.out.println("����������д�");
	 		 flag=false;
	 	     
	 	 }
	 	 if(flag)
	 	 System.out.println("�걨����Ϊ�� "+(double)(Math.round(i*1000)/1000.0));
	}
	
	//���㱾��֮����ͬ���Ͷ�ʺ�����ʲ�
	public static void Nianjin(){
		boolean flag;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("������ÿ�궨Ͷ�ʽ�: ");
	 	 p=scanner.nextDouble(); 
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
	 	 n=scanner.nextInt();
	 	if(n>=0)
	 	 {
	 		 if(i>=0&&i<=1)
	 		 {
	 		 	 f=p*(1+i)*(Math.pow(1+i,n)-1)/i;
	 		 	 flag=true;
	 		 	 
	 		 }
	 		 else
	 		 {
	 			 System.out.println("������������д�");
	 			 flag=false;
	 			 
	 		 }
	 	 }
	 	 else
	 	 {
	 		 System.out.println("����������д�");
	 		 flag=false;
	 	     
	 	 }
	 	 if(flag)
	 	 System.out.println("���ʲ���ֵΪ��"+(double)(Math.round(f*100)/100.0));     
	}
	
	//����ÿ�µȶϢ����
	public static void BenxiHuankuan(){
		double f,i,p = 0;
		int n;
		boolean flag;
		 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����������: ");
	 	 f=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("�������������: ");
	 	 n=scanner.nextInt();
	 	if(n>=0)
	 	 {
	 		 if(i>=0&&i<=1)
	 		 {
	 		 	 i=i/12;
	 		 	 n=n*12;
	 		 	 p=f*i*Math.pow(1+i, n)/(Math.pow(1+i, n)-1);
	 		 	 flag=true;
	 		 	 
	 		 }
	 		 else
	 		 {
	 			 System.out.println("������������д�");
	 			 flag=false;
	 			 
	 		 }
	 	 }
	 	 else
	 	 {
	 		 System.out.println("����������д�");
	 		 flag=false;
	 	     
	 	 }
	 	 if(flag)
		 System.out.println("ÿ�µȶϢ����Ϊ��"+(double)(Math.round(p*10000)/10000.0));
		
	}
 
 	public static void main(String[] args) {
 		int choice;
 		while(true){
 		System.out.println("\t\t|***********************|");
 		System.out.println("\t\t|  1. ��       ��      ��  \t|");
 		System.out.println("\t\t|  2. ��   ��   Ϣ   �� \t|");
 		System.out.println("\t\t|  3. ��      ��       �� \t|");
		System.out.println("\t\t|  4. ��      ��       �� \t|");
		System.out.println("\t\t|  5. �����ʲ���ֵ\t|");
		System.out.println("\t\t|  6. ��ȶϢ����\t|");	
 		System.out.println("\t\t|  7. Ͷ   ��   ��    ��     \t|");
 		System.out.println("\t\t|  0. ��        ��          \t|");
 		System.out.println("\t\t|***********************|");
 		Scanner scanner=new Scanner(System.in);
 		System.out.println("\n���������ѡ��(0~7):  ");
 		choice=scanner.nextInt();
 		switch(choice){
 		case 1:
 			Benjin();
 			break;
 		case 2:
 			Benxihe();
 			break;
 		case 3:
 			Nianshu();
 			break;
 		case 4:
 			Lilv();
 			break;
 		case 5:
 			Nianjin();
 			break;
 		case 6:
 			BenxiHuankuan();
 			break;
 		case 7:
 			TouziYunsuan();
 		
 			a++;
 			break;
 		case 0:
 			System.out.println("Thanks for using!");
 			System.exit(0);
 			break;
 		
 			
 		default:
 			{
 				System.out.println("��������!");
 				break;
 			}
 		}
 			}		
 		}

	private static void TouziYunsuan() {
		boolean flag;
		int number;
		
	 	 Scanner scanner=new Scanner(System.in);
	 	 System.out.println("�����뱾��: ");
	 	 p=scanner.nextDouble();
	 	 System.out.println("������������: ");
	 	 i=scanner.nextDouble();
	 	 System.out.println("����������: ");
		n = scanner.nextInt();
		for (int t = 1; t <= n; t++) {
			f = p * (1 + i * t);

			System.out.println("��" + t + "��\t  " + (double)(Math.round(f*100)/100.0) + "");
		}
		A[a]=p;
		B[a]=i;
		C[a]=n;
		D[a]=f;
		
		System.out.println("�Ƿ�鿴֮ǰ��¼(1Ϊ��): ");
		number = scanner.nextInt();
		if(number==1){
			System.out.print("\t"+"����"+"\t"+"������"+"\t"+"����"+"\t"+"��ֵ"+"\n");
			for(int b=0;b<=a;b++)
			{
				System.out.print(b+1+"\t"+A[b]+"\t"+B[b]+"\t"+C[b]+"\t"+D[b]+"\n");

			}
				
		}
		else{
			System.out.print("лл");
			
		}	
	}
 	}