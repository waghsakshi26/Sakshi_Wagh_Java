import java.io.*;
class Demo{
	public static void main(String[]args)throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("enter no of rows:");
	 int row=Integer.parseInt(br.readLine());
		 for(int i=1;i<=3;i++){
			 for(int j=1;j<=i;j++){
		           System.out.print("9 ");
			 }
			 System.out.println();
		 }
	}
}


