package P15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
		case 1:
		{
			System.out.println("��J���Ʀr�O1");
		}
		case 2:
		{
			System.out.println("��J���Ʀr�O2");
		}
		default :
		{
			System.out.println("��J1��2");
		}	
	}
}
}