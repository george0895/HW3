package P19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請問你是男生嘛?");
		System.out.println("請輸入Y或N");

		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		char letter =str.charAt(0);
		
		if(letter =='y'||letter == 'Y')
		{
			System.out.println("你是男生阿");
		}
		else if (letter =='n'||letter == 'N')
		{
			System.out.println("妳是女生阿");
		}
		else
		{
			System.out.println("請輸入Y或N");
		}
	}
}
