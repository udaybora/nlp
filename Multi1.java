
import java.io.File;

import java.io.IOException;

import java.text.BreakIterator;

import java.io.FileInputStream;


import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;



class Multi1 implements Runnable{  
public void run(){  
	
	PDFTextStripper pdfStripper = null;
	PDDocument pdDoc = null;
	COSDocument cosDoc = null;
    String parsedText="";
    File file = new File("C:/Users/BUDAY/Downloads/elsveir project/INS_Clean/PDF/INS_DR/new.pdf");
    try {
         PDFParser parser = new PDFParser(new FileInputStream(file));
         parser.parse();
         cosDoc = parser.getDocument();
         pdfStripper = new PDFTextStripper();
         pdDoc = new PDDocument(cosDoc);
         pdfStripper.setStartPage(1);
         pdfStripper.setEndPage(pdDoc.getNumberOfPages());
         parsedText = pdfStripper.getText(pdDoc);
         //System.out.println(parsedText);
    } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
    }
	
	
System.out.println("thread is running...");  
}  
}