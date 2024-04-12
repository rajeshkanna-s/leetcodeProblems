package com.pack;

import com.spire.pdf.PdfCompressionLevel;
import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import com.spire.pdf.exporting.PdfImageInfo;
import com.spire.pdf.graphics.PdfBitmap;

public class CompressPdfDocument {

    public static void main(String[] args) {

        //Create a PdfDocument object
        PdfDocument doc = new PdfDocument();

        //Load a PDF file
        doc.loadFromFile("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\100 program.pdf");

        //Disable incremental update
        doc.getFileInfo().setIncrementalUpdate(false);

        //Set the compression level to best
        doc.setCompressionLevel(PdfCompressionLevel.Best);

        //Loop through the pages in the document
        for (int i = 0; i < doc.getPages().getCount(); i++) {

            //Get a specific page
            PdfPageBase page = doc.getPages().get(i);

            //Get image information collection from the page
            PdfImageInfo[] images = page.getImagesInfo();

            //Traverse the items in the collection
            if (images != null && images.length > 0)
                for (int j = 0; j < images.length; j++) {

                    //Get a specific image
                    PdfImageInfo image = images[j];
                    PdfBitmap bp = new PdfBitmap(image.getImage());

                    //Set the compression quality
                    bp.setQuality(1);

                    //Replace the original image with the compressed one
                    page.replaceImage(j, bp);
                }

            //Save the document to a PDF file
            doc.saveToFile("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\New folder\\CompressPDFcontent.pdf");
            
            System.out.println("Compression Done");
            doc.close();
        }
    }
}
