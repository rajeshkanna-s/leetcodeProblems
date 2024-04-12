package com.pack;

import com.aspose.pdf.Document;
import com.aspose.pdf.Document.OptimizationOptions;

public class PDFcompressor {
	

	 public static void main(String[] pdfCompressArgs) throws Exception {
	String dataDir = null;

	// Load input document
	Document doc = new Document(dataDir + "C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\100 program.pdf");

	// Initialize OptimizationOptions object
	OptimizationOptions opt = new OptimizationOptions();

	// Enable image compression
	// Set the quality and resolution of images in PDF file
	opt.getImageCompressionOptions().setCompressImages(true);
	opt.getImageCompressionOptions().setImageQuality(10);
	opt.getImageCompressionOptions().setMaxResolution(150);
	opt.getImageCompressionOptions().setResizeImages(true);
	doc.optimizeResources(opt);

	// Save the updated file
	doc.save(dataDir + "C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\New folder\\CompressPDFcontent.pdf");
}
}