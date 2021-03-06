package movies;

public class JsonExtractor {

	
	public static String getImgSRC(String Json) {
		
		String[] characters = Json.split(" ");
		for(int iterator=0;iterator<characters.length;iterator++)
        {
            //System.out.println(characters[iterator]);
            if(characters[iterator].equals("\"Poster\":")==true)
            {
                String src = characters[iterator+1];
                StringBuilder sb = new StringBuilder(src);
                sb.deleteCharAt(src.length()-2);
                src = sb.toString();
                return src;
            }
        }
		return "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f0/Error.svg/1200px-Error.svg.png";
	}
	
	public static String getTitle(String Json) {
		
		String[] characters = Json.split(" ");
		for(int iterator=0;iterator<characters.length;iterator++)
        {
           // System.out.println(characters[iterator]);
            if(characters[iterator].equals("\"Title\":")==true)
            {
                String title="";
                while(characters[iterator+1].equals("") == false)
                {
                	title = title + " " + characters[iterator+1];
                    iterator++;
                }
                StringBuilder sb = new StringBuilder(title);
                sb.deleteCharAt(title.length()-2);
                sb.deleteCharAt(title.length()-3);
                sb.deleteCharAt(0);
                sb.deleteCharAt(0);
                title = sb.toString();
                return title;
            }
        }
		return "eruare";
	}
	
	public static String getPlot(String Json) {
		
		String[] characters = Json.split(" ");
		for(int iterator=0;iterator<characters.length;iterator++)
        {
            //System.out.println(characters[iterator]);
            if(characters[iterator].equals("\"Plot\":")==true)
            {
                String Plot="";
                while(characters[iterator+1].equals("\"Director\":") == false)
                {
                	Plot = Plot + " " + characters[iterator+1];
                    iterator++;
                }
                StringBuilder sb = new StringBuilder(Plot);
                sb.deleteCharAt(Plot.length()-3);
                sb.deleteCharAt(Plot.length()-4);
                sb.deleteCharAt(0);
                sb.deleteCharAt(0);
                Plot = sb.toString();
                return Plot;
            }
        }
		return "eruare";
	}
	
public static String getIBDCode(String Json) {
		
		String[] characters = Json.split(" ");
		for(int iterator=0;iterator<characters.length;iterator++)
        {
            //System.out.println(characters[iterator]);
            if(characters[iterator].equals("\"imdbID\":")==true)
            {
                String src = characters[iterator+1];
                StringBuilder sb = new StringBuilder(src);
                sb.deleteCharAt(src.length()-2);
                sb.deleteCharAt(src.length()-3);
                sb.deleteCharAt(src.length()-3);
                sb.deleteCharAt(0);
                src = sb.toString();
                return src;
            }
        }
		return "eruare";
	}
}
