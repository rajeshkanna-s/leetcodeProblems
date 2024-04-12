package com.pack;

import java.io.File;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;

public class S3FileUploader {
  public static void main(String[] args) {
    String accessKey = "AKIA36NDIH54ACQTPQM2";
    String secretKey = "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";
    String bucketName = "zezha-talent";
    String objectKey = "pdf_files/myimage.pdf";
    String filePath = "C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\image.pdf";

    // Set up AWS credentials
    BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
    AWSStaticCredentialsProvider credsProvider = new AWSStaticCredentialsProvider(awsCreds);

    // Create an S3 client
    AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
        .withCredentials(credsProvider)
        .withRegion("us-east-1")
        .build();

    // Upload a file to S3
    File file = new File(filePath);
    PutObjectRequest putRequest = new PutObjectRequest(bucketName, objectKey, file);
    PutObjectResult putResult = s3Client.putObject(putRequest);
    
    System.out.println("File uploaded successfully!");
  }
}

