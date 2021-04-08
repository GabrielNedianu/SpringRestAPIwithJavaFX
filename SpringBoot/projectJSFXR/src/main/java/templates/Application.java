package templates;
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

public class Application 
{
	public static void main(String[] args)
	{
		String host = "http://www.omdbapi.com/";
		String charset = "UTF-8";
		String x_rapidapi_host = "www.omdbapi.com";
	    String x_rapidapi_key = "bc1d12f1";//Type here your key
	    // Params
	    String i = "tt0372784";
	// Format query for preventing encoding problems
	    try 
	    {
	    	String query = String.format("i=%s", URLEncoder.encode(i, charset));
	    	HttpResponse <JsonNode> response = Unirest.get(host + "?" + query + "&apikey="+x_rapidapi_key)
	      	      .header("x-rapidapi-host", x_rapidapi_host)
	      	      .header("x-rapidapi-key", x_rapidapi_key)
	      	      .asJson();
	    	 Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    	 JsonParser jp = new JsonParser();
	    	 JsonElement je = jp.parse(response.getBody().toString());
	    	 String prettyJsonString = gson.toJson(je);
	    	 System.out.println(prettyJsonString);
	    }catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
//	    HttpResponse <JsonNode> response = Unirest.get(host + "?" + query)
//	    	      .header("x-rapidapi-host", x_rapidapi_host)
//	    	      .header("x-rapidapi-key", x_rapidapi_key)
//	    	      .asJson();
//	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
//	    JsonParser jp = new JsonParser();
//	    JsonElement je = jp.parse(response.getBody().toString());
//	    String prettyJsonString = gson.toJson(je);
	}
}
