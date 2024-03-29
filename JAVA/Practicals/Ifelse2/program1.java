class Range{
	public static void main(String[]args){
		int num1=100;
		int num2=0;
		int num3=-11;
		if(1<=num1 && 1000>=num1){
			System.out.println("100 is in the range 1 to 1000");
		}
		else{
				System.out.println("100 is not  in the range 1 to 1000");
	}
	        if(1<=num2 && 1000<=num2){
			System.out.println("0 is in the range 1 to 1000");
		}
		else{
			System.out.println("0 is not in the range 1 to 1000");
		}
		if(1<=num3 && 1000<=num3){
			System.out.println("-11 is in the range 1 to 1000");
		}
		else{
			System.out.println("-11 is not in the range 1 to 1000");
		}
	}
}
