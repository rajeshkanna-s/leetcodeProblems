package com.pack;

import java.io.IOException;  
import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;  
public class CreatePdf   
{  
public static void main(String args[]) throws IOException   
{  
PDDocument pdfdoc= new PDDocument(); 
PDPage r = new PDPage();
pdfdoc.addPage(r);  
//path where the PDF file will be store  
pdfdoc.save("C:\\Users\\RAJESHKANNAS\\Desktop\\pdffolder\\Rajeshkanna.pdf");  
pdfdoc.save("C:\\Users\\RAJESHKANNAS\\Desktop\\pdffolder\\Rajesh.pdf"); 
pdfdoc.save("C:\\Users\\RAJESHKANNAS\\Desktop\\pdffolder\\Kanna.pdf");
pdfdoc.save("C:\\Users\\RAJESHKANNAS\\Desktop\\pdffolder\\RK.pdf"); 
//prints the message if the PDF is created successfully   
System.out.println("PDF created");  
//closes the document  
pdfdoc.close();  
}  
}  
