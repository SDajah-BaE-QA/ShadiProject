public class CoreJavaBrushUp1 {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		int myNum = 5;

		String website = "Rahul Shetty Academy";

		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;

		System.out.println(myNum + " is the value stored in the myNum variable");

		System.out.println(website);

//Arrays -

		int[] arr = new int[5];// 5, 10

		arr[0] = 1;

		arr[1] = 2;

		arr[2] = 3;

		arr[3] = 4;

		arr[4] = 5;

		int[] arr2 = { 6, 7, 8, 9, 10 };

		System.out.println(arr2[0]);

		System.out.println("**********************");

//for loop arr.length - 5

		for (int i = 0; i < arr.length; i++) // 4
		{
			System.out.println(arr[i]);
		}

		System.out.println("**********************");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("**********************");

		String[] name = { "rahul", "shetty", "selenium" };

		for (int i = 0; i < name.length; i++)

		{
			System.out.println(name[i]);
		}

		System.out.println("**********************");

		for (String s : name) {
			System.out.println(s);
		}

		System.out.println("**********************");

	}

}