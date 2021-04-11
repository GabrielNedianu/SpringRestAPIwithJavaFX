package movies;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SearchingMovie 
{
	
	public static void main(String args[]) {
		//System.out.println(findMovie("tt0120737",false));
		System.out.println(findMovie("Lord",true));
	}
	
	//Returning a prettyJson about what we were searching
	public static String findMovie (String data,boolean cautare)
	{
		String host = "http://www.omdbapi.com/";
		String charset = "UTF-8";
		String x_rapidapi_host = "www.omdbapi.com";
	    String x_rapidapi_key = "bc1d12f1";//Type here your key
	    // Params
	    
	    String querryType = null;
	    if(cautare)
	    {
	    	querryType="s";
	    }
	    else
	    {
	    	querryType="i";
	    }
	// Format query for preventing encoding problems
	    
	    String query;
		try {
			query = String.format(querryType +"=%s", URLEncoder.encode(data, charset));
	    	HttpResponse <JsonNode> response = Unirest.get(host + "?" + query + "&apikey="+x_rapidapi_key)
	      	      .header("x-rapidapi-host", x_rapidapi_host)
	      	      .header("x-rapidapi-key", x_rapidapi_key)
	      	      .asJson();
	    	 Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    	 JsonParser jp = new JsonParser();
	    	 JsonElement je = jp.parse(response.getBody().toString());
	    	 String prettyJsonString = gson.toJson(je);
	    	 //System.out.print(prettyJsonString);
	    	 return prettyJsonString;
	    }catch (UnirestException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    return null;
	}
}
