



import java.util.List;



class Multi2 implements Runnable{  
public void run(){  
	
	 String parsedText="";
	long count = 0,wordCount=0; List<String> misspelled;
 	NewSpellChecker NewSpellChecker = new NewSpellChecker();

		wordCount += parsedText.split("\\s").length;
	misspelled = NewSpellChecker.getMisspelledWords(parsedText);
	count = count + misspelled.size();
	
	System.out.println("///////////////////////////SPELLCHECK/////////////////////////////");
	
	System.out.println("Number of misspelled words : "+count);
	System.out.println("Total number of words are  : "+wordCount);
	System.out.println("Percentage of wrong words  : "+(count*100)/(float)wordCount+"%");
	String output = ""+count;
	
	
	
System.out.println("thread ...");  
}  
}