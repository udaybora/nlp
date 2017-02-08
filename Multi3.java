
import java.text.BreakIterator;

import javax.swing.JOptionPane;


import org.languagetool.JLanguageTool;
import org.languagetool.language.BritishEnglish;
import org.languagetool.rules.RuleMatch;


import java.util.List;
import java.util.Locale;







class Multi3 implements Runnable{  
public void run(){  
	
	try{
		 String parsedText="";
        long sentenceCount = 0;
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(parsedText);
        int start = iterator.first();
        for (int end = iterator.next();
            end != BreakIterator.DONE;
            start = end, end = iterator.next()) {
          sentenceCount++;
       
        }
        

        JLanguageTool langTool = new JLanguageTool(new BritishEnglish());
		long countGrammar = 0;
		List<RuleMatch> matches;
		matches = langTool.check(parsedText);
		
		for (RuleMatch match : matches) {
		countGrammar++;
			if((match.getMessage().equals("Possible typo: you repeated a whitespace"))||(match.getMessage().equals("Possible spelling mistake found"))){
				countGrammar--;
			}
			else{
	    		  
	    	
    		}
		}
		
    	System.out.println("////////////////////////GRAMMAR CHECK/////////////////////////////");
		System.out.println("Total mistakes are  : "+countGrammar);
		System.out.println("Total sentences are : "+sentenceCount);
		System.out.println("Percentage(with total sentences as measure): "+(countGrammar*100/sentenceCount)+"%");
        //System.out.println(parsedText);
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	
	
	
	
	
System.out.println("thread is running...");  
}
}