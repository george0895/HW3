package P21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn��ܭ������u");
		System.out.println("�п�J���");

		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		int res =Integer.parseInt(str);
		
		char ans = (res ==1)?'a':'b';	
		System.out.println("��ܤF"+ans+"�u��");
	}

}
