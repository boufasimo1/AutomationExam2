package loops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;

public class Proper {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		prAll("Data/Test.properties");
//		reader("Data/Test.properties",0);	
		
	}
	public static void prd(String path , String key) throws Exception {
		Properties pr = new Properties();
		FileInputStream fi = new FileInputStream(path);
		
		pr.load(fi);
		
		System.out.println(pr.get(key));
		
		
	}
	
	    
		
		public static void reader (String path,int key  ) throws Exception {
		
			File f = new File(path);
			FileReader rd = new FileReader(f);
			BufferedReader bf = new BufferedReader(rd);
			String line = null;
			
			LinkedList<String> lines = new LinkedList<String>();
			
		
			
			while ((line= bf.readLine()) != null) {
            	
            lines.add(line);
		
            LinkedHashMap<String, String> m = new  LinkedHashMap<String, String>();
            m.put("A", "line");
            System.out.println();
            }
			
			System.out.println(lines.get(key));
			
			
	}
		public static void prAll (String path ) throws Exception {
			
			File f = new File(path);
			FileReader rd = new FileReader(f);
			BufferedReader bf = new BufferedReader(rd);
			String line = null;
		
//			while ((bf.readLine()) != null) {
				System.out.println(bf.readLine());
				line = bf.readLine();
				System.out.println(bf.readLine());
//			}
            
//			for (int i=0;i<3;i++) {
//            System.out.println(bf.readLine());
//            }
		
            }
}
