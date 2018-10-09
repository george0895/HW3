package P14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	System.out.println("請輸入整數");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
		case 1:
		{
			System.out.println("輸入的數字是1");
			break;
		}
		case 2:
		{
			System.out.println("輸入的數字是2");
			break;
		}
		default :
		{
			System.out.println("");
			break;
		}	
		}
	}
}
