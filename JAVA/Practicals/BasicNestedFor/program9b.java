class NestedFor{
	public static void main(String[]args){
		char ch='C';
		int num=1;
		for(int i=1;i<=3;i++){	
                   
			for(int j=1;j<=3;j++){
				System.out.print("C" + num + " ");
                                 num++;
			}

	                System.out.println();
		}
	}
}
