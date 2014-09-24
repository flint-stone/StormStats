import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {
	
	public static void main(String[] args) throws IOException{
		String[] cmd = {"/bin/sh","-c","netstat -s | grep -i InOctets | cut -f2 -d':'"};
		Process p = Runtime.getRuntime().exec(cmd);
		InputStreamReader isr = new InputStreamReader(p.getInputStream());
		BufferedReader br = new BufferedReader(isr);  
		String s = null; 
		while ((s = br.readLine()) != null) {  
		    /* do someting with 's' */
			System.out.println(s);
			s=s.replaceAll("\\s", "");
			int i=Integer.parseInt(s);
			double d=(double)i;
			System.out.println("netstat: inoctets-"+d);
			
		}  
	}

}
