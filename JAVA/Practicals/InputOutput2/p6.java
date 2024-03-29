import java.io.*;
class Demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of rows");
		 int rows=Integer.parseInt(br.readLine());

		 for(int i=1;i<=rows;i++){
			  int x=1;
                          char ch='B';

		   for(int j=1;j<=1;j++){
		   if(i%2==0){
			   System.out.print(ch++ + " ");
		   }
		   else{
			  System.out.print(x++ + " ");
		   }
		   }
		    System.out.println();
		   }
	}
}	
					   
