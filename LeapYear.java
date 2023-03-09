//실습 4. 윤년 검사 프로그램
//4로 떨어지면 윤년 100으로 떨어지면 윤년 X 400으로 떨어지면 윤년
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;
		System.out.println("다음 해가 윤년인지 확인하는 코드입니다.");
		if(year % 400 == 0)
			System.out.println(year + "년은 윤년입니다.");
		
		else //400으로 안 나누어 떨어지면
		{
			if(year % 100 == 0) //400으로 안나누어떨어지면서 100으로 나누어 떨어지면
				System.out.println(year + "년은 윤년이 아닙니다.");
			else
				if(year % 4 == 0) //400으로 안 나누어떨어지면서 4로 나누어 떨어지면
					System.out.println(year + "년은 윤년입니다.");
				else
					System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}
}
