package com.pack;

import java.io.File;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.GetObjectRequest;

public class S3FileDownloader {
  public static void main(String[] args) {
    String accessKey = "AKIA36NDIH54ACQTPQM2";
    String secretKey = "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";
    String bucketName = "zezha-talent";
    String objectKey = "pdf_files/myimage.pdf";
    String downloadFilePath = "C:\\Users\\RAJESHKANNAS\\Documents\\SAMPLE DOC\\rajeshkanna\\myimage.pdf";

    // Set up AWS credentials
    BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
    AWSStaticCredentialsProvider credsProvider = new AWSStaticCredentialsProvider(awsCreds);

    // Create an S3 client 
    AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
        .withCredentials(credsProvider)
        .withRegion("us-east-1")
        .build();

    // Download a file from S3
    S3Object s3object = s3Client.getObject(new GetObjectRequest(bucketName, objectKey));
    File file = new File(downloadFilePath);
    s3Client.getObject(new GetObjectRequest(bucketName, objectKey), file);
    System.out.println("File downloaded successfully!");
  }
}

