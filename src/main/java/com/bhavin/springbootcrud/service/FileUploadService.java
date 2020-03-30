package com.bhavin.springbootcrud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileUploadService {
    //destination folder to upload the files
    private static String UPLOAD_FOLDER = "D://test//";

    public void fileUpload(MultipartFile file) throws IOException {
        Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
        file.transferTo(new File(String.valueOf(path)));
    }
}
