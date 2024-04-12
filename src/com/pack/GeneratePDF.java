package com.pack;

import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.DocumentException;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  
public class GeneratePDF  
{  
public static void main(String args[])  
{  
//created PDF document instance   
Document doc = new Document();  
try  
{  
//generate a PDF at the specified location  
PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\RAJESHKANNAS\\Desktop\\pdffolder\\itext\\Motivation.pdf"));  
System.out.println("PDF created.");  
//opens the PDF  
doc.open();  
//adds paragraph to the PDF file  
doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on.")); 

//We can also set the attributes (author, date, title, subject, etc.) to the PDF file.
doc.addAuthor("Rajehskanna");  
doc.addCreationDate();  
doc.addCreator("RK");  
doc.addTitle("Setting Attribute");  
doc.addSubject("Setting attributes to the PDF files.");  

//close the PDF file  
doc.close();  
//closes the writer  
writer.close();  
}   
catch (DocumentException e)  
{  
e.printStackTrace();  
}   
catch (FileNotFoundException e)  
{  
e.printStackTrace();  
}  
}  
}  
