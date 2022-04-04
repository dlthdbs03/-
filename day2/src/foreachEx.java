public class foreachEx {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		int sum = 0;
		for(int k : array) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 "+sum);
		String s[]= {"당근", "양파", "가지", "감자", "오이", "양상추"};
		for(String a : s) {
			System.out.print(a + " ");
		}
	}

}
