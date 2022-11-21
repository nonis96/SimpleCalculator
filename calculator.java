import java.util.Scanner;
class calculator{
	public static void main(String args[]){

		int A,x,y,sum,sub,mul,modu;
		int ex = 0;
		float dev;

		Scanner valu = new Scanner(System.in);

		do{

			System.out.println("\nSelect Operation");

			System.out.println("1: Addition ");
			System.out.println("2: Substraction");
			System.out.println("3: Multiplication ");
			System.out.println("4: Division");
			System.out.println("5: Modulation ");
			System.out.println("0: Exit ");


			System.out.print("Enter operation number  = ");
			A = valu.nextInt();
			
			if(A==0)
			{
				System.out.println("Bye");
				ex=1;
			}
			else
			{
				System.out.print("Enter number 1 =\t");
				x = valu.nextInt();

				System.out.print("Enter number 2 =\t");
				y = valu.nextInt();

				if(A==1)
				{
					sum = x+y;
					System.out.println("Addition ="+sum);
				}

				else if(A==2)
				{
					sub = x-y;
					System.out.println("Substraction ="+sub);
				}

				else if(A==3)
				{
					mul = x*y;
					System.out.println("Multiplication ="+mul);
				}

				else if(A==4)
				{
					dev = (float)x/(float)y;
					System.out.println("Division ="+dev);
				}

				else if(A==5)
				{
					modu = x%y;
					System.out.println("Modulation ="+modu);
				}
				
				else
				{
					System.out.println("Error");
				}
			}
		}while (ex==0);
	}
}