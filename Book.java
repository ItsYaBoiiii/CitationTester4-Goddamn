
package citationmachinetester;

import java.util.HashMap;


public class Book extends CitationMachine{
    String cityOfPublication;
    String publisher;
    
    public Book( HashMap c ){
        super(c);
        this.cityOfPublication = (String)c.get(cityOfPublication);
        this.publisher = (String)c.get(publisher);
        
        if(authorLast != "" || authorLast != null){
            authorLast = authorLast + ".";
        }
        
        if(authorFirst != "" || authorFirst != null){
            authorFirst = authorFirst + ". ";
        }
        
        if(title != "" || title != null){
            title = title + ".";
        }
        
        if(cityOfPublication != "" || cityOfPublication != null){
            cityOfPublication = cityOfPublication + ": ";
        }
        else{
            cityOfPublication = "N.p.";
        }
        
        if(publisher != ""|| publisher != null){
            publisher = publisher + ".,";
        }
        else{
            publisher = "n.p.";
        }
        
        if(publishYear != "" || publishYear != null){
            publishYear = publishYear + ". ";
        }
        else{
            publishYear = "n.p.";
        }
        
        

            
    }
    
    public void cite(){
       
        citation = authorLast + authorFirst + title + cityOfPublication + publisher + publishYear
                + " Print.";
    }
    
}
