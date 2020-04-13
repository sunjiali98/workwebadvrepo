package webadv.s17206101.p02;
/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws IOException{
        Scanner in=new Scanner(System.in); 
		 String name=in.nextLine(); 
		 String password=in.nextLine();
		ArrayList<String> arrayList = new ArrayList<>();		
		try {			
			FileReader fr = new FileReader("D:/workwebadvrepo/p02/denglu.txt");			
			BufferedReader bf = new BufferedReader(fr);			
			String str;			// 按行读取字符串			
			while ((str = bf.readLine()) != null) {				
				arrayList.add(str);			
				}			
			bf.close();			
			fr.close();		} 
		catch (IOException e) {			
			e.printStackTrace();		
			}		
		String s1 = arrayList.get(0);
		String s2 = arrayList.get(1);
		if(s1.equals(name)&&s2.equals(password)) {
			System.out.println("登录成功");
		}
		else {
			System.out.println("登录失败");
		}
              System.out.println(s1);
              System.out.println(sha256hex(s2));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
