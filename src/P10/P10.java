package P10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num ==1)
		{
			System.out.println("��J���Ʀr�O1");
		}
		else
		{
			System.out.println("��J���Ʀr�O1�H�~���Ʀr");
		}
		System.out.println("�����B�z");
	}

}
