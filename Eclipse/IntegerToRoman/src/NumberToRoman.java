import java.util.Scanner;

public class NumberToRoman {

	public static void main(String[] args) {
		// 开始运行程序
		running();
	}
	
	private static void running() {
		
		// 用while（真）无限次执行程序 
		while(true) {
			
			// 读取输入数字
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a value between 1 and 3999 inclusive: ");
			int value = scanner.nextInt();
			
			// 如果输入数字 小与 1 或者 大于3999.
			if (value < 1 || value > 3999) {
				System.out.println("Value entered is not in required range, please re-enter the value !!");
				continue;
			}
			// 开始转换 获取罗马字符并且输出
			String roman = intToRoman(value);
			System.out.println("The value " + value + " is Roman Numeral: " + roman);
			
			// 如果想执行一次程序结束就用break；
			break;
		}
	}
	
	 public static String intToRoman(int num) {
	    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0;i<values.length;i++) {
	        while(num >= values[i]) {
	            num -= values[i];
	            sb.append(strs[i]);
	        }
	    }
	    return sb.toString();
	 }
}
