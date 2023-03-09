
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f); //5 / 4 가 정수형이니까
		
		f = (double) 5 / 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8; //소수점 아래 절사
		System.out.println(i);
	}

}
