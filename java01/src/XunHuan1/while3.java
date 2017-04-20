package XunHuan1;

public class while3 {

	public static void main(String[] args) {
		int i = 25;
		int year = 2016;
		int sum = i += i * (1 + 0.25);
		sum = sum += year;
		while (i <= 100) {
			i++;
       }
		System.out.println(sum + "年，培训人员将达到100万人！");
	}

}
