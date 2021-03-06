package demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import movies.MovieSearch;
import randomMovieGenerator.*;

@Controller
public class MovieReturnerController {
	
	    @GetMapping(value = "/RandomMovie", produces = MediaType.TEXT_HTML_VALUE)
	    @ResponseBody
	    public String movieRandAsHTML() {
	    	//value= value + " ";
	    	String numeFilmString = Generator.movie();
	    	String[] cautare = MovieSearch.search(numeFilmString);
	    	
	        return "<html lang=\"en\">\n"+
	        "<head>\n"+
	            "<meta charset=\"UTF-8\">\n"+
	            "<meta name=\"Author\" content=\"Gabriel-Catalin Nedianu\">\n"+
	            "<meta name=\"keywords\" content=\"movies, description, games\">\n"+
	            "<meta name=\"description\" content=\"Movies, games and their description\">\n"+


	            "<title>Counter-Strike:Global Offensive</title>\n"+
	            "<style>\n"+
	                "h1 {\n"+
	                    "text-align: center;\n"+
	                "}\n"+
	                "figure img {\n"+
	                    "display: block;\n"+
	                    "margin-left: auto;\n"+
	                    "margin-right: auto;\n"+
	                "}\n"+
	                "p{\n"+
	                    "text-align: center;\n"+
	                "}\n"+
	                
	    "</style>\n"+
	        "</head>\n"+

	    "</head>\n"+

	        "<body>\n"+
	            "<header>\n"+
	                "<h1 id = \"Top\">\n"+ cautare[0]    + "</h1>\n"+
	            "</header>\n"+
	            "<main>\n"+
	            "<figure>\n"+
	                "<img src= "+ cautare[2] + "alt=\"Imagine Film\"  width=\"460\" height=\"600\" class=\"center\">\n"+
	            "</figure>\n"+
	            "<p style=\"font-size:160%;\">\n"+    cautare[1]    +"</p>\n" +
	            "</main>\n"+
	        "</body>\n"+
	    "</html>\n";
	    }
	    
	    @GetMapping(value = "/Movie/search={search}", produces = MediaType.TEXT_HTML_VALUE)
	    @ResponseBody
	    public String movieAsHTML(@PathVariable String search) {
	    	
	    	String filmDeCautatString = search;
	    	String[] cautare = MovieSearch.search(filmDeCautatString);
	    	
	        return "<html lang=\"en\">\n"+
	        "<head>\n"+
            "<meta charset=\"UTF-8\">\n"+
            "<meta name=\"Author\" content=\"Gabriel-Catalin Nedianu\">\n"+
            "<meta name=\"keywords\" content=\"movies, description, games\">\n"+
            "<meta name=\"description\" content=\"Movies, games and their description\">\n"+


            "<title>Cauti si tu un film aici</title>\n"+
            "<style>\n"+
                "h1 {\n"+
                    "text-align: center;\n"+
                "}\n"+
                "figure img {\n"+
                    "display: block;\n"+
                    "margin-left: auto;\n"+
                    "margin-right: auto;\n"+
                "}\n"+
                "p{\n"+
                    "text-align: center;\n"+
                "}\n"+
                
    "</style>\n"+
        "</head>\n"+

    "</head>\n"+

        "<body>\n"+
            "<header>\n"+
                "<h1 id = \"Top\">\n"+ cautare[0]    + "</h1>\n"+
            "</header>\n"+
            "<main>\n"+
            "<figure>\n"+
                "<img src= "+ cautare[2] + "alt=\"Imagine Film\"  width=\"460\" height=\"600\" class=\"center\">\n"+
            "</figure>\n"+
            "<p style=\"font-size:160%;\">\n"+    cautare[1]    +"</p>\n" +
            "</main>\n"+
            "<button onclick=\"window.location.href='http://localhost:8080/';\">Cauta alt film</button>"+
            
        "</body>\n"+
    "</html>\n";
	    }
	
	
	
}
