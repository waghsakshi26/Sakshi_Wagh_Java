class Nested{
	public static void main(String[]args){
		char ch=65;
		for(int i=1;i<=3;i++){
		  for(int j=1;j<=3;j++){
		    if(i%2!=0){
			    System.out.print(ch++ + " ");
		  }
		  System.out.println();
		}
	}
}
}
