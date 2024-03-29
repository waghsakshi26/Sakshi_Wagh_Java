class Whileloop{
	public static void main(String[]args){
		int i=1;
		char ch='A';
		while(i<=6){
			if(i%2==0){
				System.out.print(i + " " );
			}
			else{
				System.out.print(ch + " " );
				
			}
			ch++;
			i++;
			
		}
	}
}

