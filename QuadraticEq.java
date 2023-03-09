//실습 5
import java.util.Scanner;
public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("x^2 + bx + c의 해를 구하는 코드입니다.");
		System.out.print("b를 입력하세요 >> ");
		int b = scanner.nextInt();
		System.out.print("c를 입력하세요 >> ");
		int c = scanner.nextInt();
		int inroot = b * b - 4 * c;
		
		if(inroot < 0)
			System.out.println("이 방정식은 실근이 존재하지 않습니다.");
		else
		{
			double makeroot = Math.sqrt(inroot);
			
			double isroot_1 = (-b + makeroot) / 2;
			double isroot_2 = (-b - makeroot) / 2;
			if(inroot == 0)
				System.out.println("이 방정식의 해는 "+ isroot_1 + "(중근)입니다.");
			else
				System.out.println("이 방정식의 해는 " + isroot_1 + "와(과)" + isroot_2 + "입니다.");
			scanner.close();
		}
	}

}
