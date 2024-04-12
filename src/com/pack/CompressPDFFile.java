package com.pack;

import com.aspose.pdf.Document;
import com.aspose.pdf.optimization.OptimizationOptions;
import com.aspose.pdf.License;

public class CompressPDFFile {
   
    public static void main(String[] pdfCompressArgs) throws Exception {
   
        // Setting the product license to Compress PDF in Java
       // License lic = new License();
       // lic.setLicense("Aspose.Total.lic");

        // Load source PDF document for compression
        Document CompressPdfDocument = new Document("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\100 program.pdf");

        // Optimize PDF document.Note that this method cannot guarantee document shrinking and depends
        // on content of PDF
        OptimizationOptions PdfoptimizeOptions = new OptimizationOptions();

        // Set CompressImages option
        PdfoptimizeOptions.getImageCompressionOptions().setCompressImages(true);

        // Set the image quality option
        PdfoptimizeOptions.getImageCompressionOptions().setImageQuality(100);

        // Applying set options on PDF resources
        CompressPdfDocument.optimizeResources(PdfoptimizeOptions);

        // Save the compressed PDF document
        CompressPdfDocument.save("C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\New folder\\CompressPDFcontent.pdf");
        System.out.println("Compression DONE");
    }    
}