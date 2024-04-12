package com.pack;

import com.spire.pdf.*;
import com.spire.pdf.exporting.PdfImageInfo;
import com.spire.pdf.graphics.PdfBitmap;

public class CompressPDFImage {
    public static void main(String[] args) {

        //Load a sample PDF document
        PdfDocument document = new PdfDocument();
        document.loadFromFile("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\image.pdf");

        //Compress the image quality in the PDF document
        document.getFileInfo().setIncrementalUpdate(false);

        for (int i = 0; i < document.getPages().getCount(); i++) {

            PdfPageBase page = document.getPages().get(i);
            PdfImageInfo[] images = page.getImagesInfo();
            if (images != null && images.length > 0)
                for (int j = 0; j < images.length; j++) {
                    PdfImageInfo image = images[j];
                    PdfBitmap bp = new PdfBitmap(image.getImage());
                    bp.setQuality(20);
                    page.replaceImage(j, bp);

                }
        }

        //Save the document to file
        document.saveToFile("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\New folder\\CompressPDFImage.pdf", FileFormat.PDF);
        System.out.println("Compression Done");
    }
}
