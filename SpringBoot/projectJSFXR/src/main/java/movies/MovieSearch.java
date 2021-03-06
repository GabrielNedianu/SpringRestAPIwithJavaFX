package movies;

//Function for getting a response for a request
public class MovieSearch {

	public static void main(String args[]) {
		String[] rez = search("cOUNTER sTRIKE");
		//System.out.println(rez[2]);
	}
	
	//Function that extracts for our search in this order: Name, Plot, IMG_SRC
	public static String[] search(String cautare) {
		
		String[] rezultat = new String[3];
		
		String cautareJSON="";
		cautareJSON = SearchingMovie.findMovie(cautare, true);
		//System.out.println(cautareJSON);
		String imbdID = JsonExtractor.getIBDCode(cautareJSON);
		//System.out.println(imbdID);
		
		cautareJSON = SearchingMovie.findMovie(imbdID, false);
		//System.out.println(cautareJSON);
		rezultat[0] = JsonExtractor.getTitle(cautareJSON);
		rezultat[1] = JsonExtractor.getPlot(cautareJSON);
		rezultat[2] = JsonExtractor.getImgSRC(cautareJSON);
		
		//System.out.println(rezultat[0]);
		//System.out.println(rezultat[1]);
		//System.out.println(rezultat[2]);
		
		return rezultat;
	}
	
}
