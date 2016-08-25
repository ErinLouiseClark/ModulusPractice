import java.util.Scanner;
public class modulusPractice {

	public static void main(String[] args) {
		//exercise1();
		//exercise2();
		exercise3();
	}
	
	public static void exercise1(){
		System.out.println("Enter a number.");
		Scanner userInput = new Scanner(System.in);
		int num = userInput.nextInt();
		if(num%2 == 0){
			System.out.println("The number is even.");
		}
		else{
			System.out.println("The number is odd.");
		}
	}
	
	public static void exercise2(){
		System.out.println("Enter a year.");
		Scanner userInput1 = new Scanner(System.in);
		int year = userInput1.nextInt();
		if((2016-year)%4 == 0){
			System.out.println("That year is a leap year.");
		}
		else{
			System.out.println("That year is not a leap year.");
		}
	}
	
	public static void exercise3(){
		int[] array = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
		for(int i = 0; i < 10; i++){
			if((i+1)%3 == 0){
				System.out.println(array[i]);
			}
			else{
				System.out.print(" ");
			}
		}
		
	}

}
