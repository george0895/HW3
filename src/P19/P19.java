package P19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݧA�O�k�͹�?");
		System.out.println("�п�JY��N");

		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		char letter =str.charAt(0);
		
		if(letter =='y'||letter == 'Y')
		{
			System.out.println("�A�O�k�ͪ�");
		}
		else if (letter =='n'||letter == 'N')
		{
			System.out.println("�p�O�k�ͪ�");
		}
		else
		{
			System.out.println("�п�JY��N");
		}
	}
}
