package com.pack;

import com.spire.pdf.PdfDocument;

public class SplitPdfByEachPage {

    public static void main(String[] args) {

        //Specify the input file path
        String inputFile = "C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\100 program.pdf";

        //Specify the output directory
        String outputDirectory = "C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\New folder\\";

        //Create a PdfDocument object
        PdfDocument doc = new PdfDocument();

        //Load a PDF file
        doc.loadFromFile(inputFile);

        //Split the PDF to one-page PDFs
        doc.split(outputDirectory + "output-{0}.pdf", 1);
    }
}
