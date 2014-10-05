import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
 
public class emails {
	public static void main(String[] args){
 
	try {
		File fileDir = new File("input.txt");
 
		BufferedReader in = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));
		File fileDir2 = new File("test.txt");
		 
		Writer out = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream(fileDir2), "UTF8"));
		
		String str;
 
		while ((str = in.readLine()) != null) {
		    System.out.println(str);
		    
		    char[] emailChar = str.toCharArray();
		    String outputString = "";
		    String atTheEnd = ""; 
			for (int j = 0; j < emailChar.length; ++j)
			{
				if ((int)(emailChar[j])>=33 && (int)(emailChar[j])<=126)
					outputString += (emailChar[j]); 
				else {
					//Add the char location 
					outputString += "+" + Integer.toString(j); 
					//Get Unicode value of specified character 
					int utf8 = Character.codePointAt(emailChar, j);
					//Get hex value of unicode 
					outputString += Integer.toHexString(utf8); 
					
					//The replaced weird characters are to be placed after the string was
					//Fully converted
					atTheEnd += emailChar[j]; 
				}
			}
			outputString += " " + atTheEnd; 
			out.append(outputString).append("\r\n");
			System.out.println(outputString);
		}
		out.flush();
		out.close();
        in.close();
	    } 
	    catch (UnsupportedEncodingException e) 
	    {	
			System.out.println(e.getMessage());
	    } 
	    catch (IOException e) 
	    {
			System.out.println(e.getMessage());
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
	    }
}}