public class foreachEx {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		int sum = 0;
		for(int k : array) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("���� "+sum);
		String s[]= {"���", "����", "����", "����", "����", "�����"};
		for(String a : s) {
			System.out.print(a + " ");
		}
	}

}
