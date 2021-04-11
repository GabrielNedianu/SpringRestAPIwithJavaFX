package application;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsuopReturner {

		public static void main(String[] args) 
		{
			String[] rezultat=Application.getInformation("Lord");
			for(int i=0;i<rezultat.length;i++)
			{
				System.out.println(rezultat[i]);
			}

		}
		
		public static String[] getInformation(String choice)
		{
			String[] stringResult = new String[3];
			String url = "http://localhost:8080/Movie/search=" + choice;
			
			
			try 
			{
				Document doc = Jsoup.connect(url).get();
				
				Element temp = doc.select("h1").first();
				stringResult[0] = temp.text();
				
				temp = doc.select("img").first();
				String srcValue = temp.attr("src");
				stringResult[1] = srcValue;
				
				temp = doc.select("p").first();
				stringResult[2]=temp.text();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
				
			
			return stringResult;
		}
}
