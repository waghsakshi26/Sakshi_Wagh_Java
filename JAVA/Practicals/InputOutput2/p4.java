import java.io.*;
class Number{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of rows");
		int rows=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=rows;i++){
			 char ch1='D';
                          char ch2='d';
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch1-- + " ");
				}
				else{
					System.out.print(ch2-- +" ");
				}
			}
				System.out.println();
			}
		}
	}


