package com.pack;

import com.spire.pdf.*;

public class CompressPDF {
    public static void main(String[] args) {

        //Load a sample PDF document
        PdfDocument document = new PdfDocument();
        document.loadFromFile("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\100 program.pdf");

        //Compress the content in the PDF document
        document.getFileInfo().setIncrementalUpdate(false);
        document.setCompressionLevel(PdfCompressionLevel.Best);

        //Save the document to file
        document.saveToFile("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\New folder\\CompressPDFcontent.pdf", FileFormat.PDF);
        
        System.out.println("Compression Done");
    }
}
