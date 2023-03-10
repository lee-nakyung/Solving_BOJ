import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	
	
	public static void main(String args[]) throws IOException{
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		
		Integer array[]=new Integer[N];
		
		for(int i=0; i<N; i++) {
			array[i]=Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array,Collections.reverseOrder());//reverseOrder 사용할 때는 배열 integer로 받아야함 
		for(int i=0; i<N; i++) {
			bw.write(array[i]+"\n");
		}
		
		bw.flush();
	}
}
