
public class PhoneNumber {

	public static void main(String[] args) {
		String str = "   23- /444-1  ,;'8/.][=-254- 0.94";
		System.out.println(str = convertPhone(str));
	}
	
	public static String convertPhone(String s){
		String numbers = s.replaceAll("[\\W]", "");
		System.out.println(numbers);
		
		String newNumber = "";
		int i = 0;
		int length = numbers.length();
		while(length > 0){
			// 3 numbers at the end
			if(numbers.length() % 3 == 0){
				newNumber += numbers.substring(i, i + 3) + "-";
				i += 3;
				length -= 3;
				if(length == 0) return newNumber.substring(0, newNumber.length() - 1);
			}
			
			// 2 numbers at the end 
			if(numbers.length() % 3 == 2){
				if(length == 2){
					return newNumber += numbers.substring(numbers.length() - 2 , numbers.length());
				}
				newNumber += numbers.substring(i, i + 3) + "-";
				i += 3;
				length -= 3;
			}
			
			// 4 numbers at the end
			if(numbers.length() % 3 == 1){
				if(length == 4){
					newNumber += numbers.substring(numbers.length() - 4 , numbers.length() - 2) + "-";
					newNumber += numbers.substring(numbers.length() - 2 , numbers.length());
					return newNumber;
				}
				newNumber += numbers.substring(i, i + 3) + "-";
				i += 3;
				length -= 3;
			}
		}
		return newNumber;
	}
}
