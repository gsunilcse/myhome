package com.myhome.services;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileService {

	public void storeFile(MultipartFile file) throws IOException;

	public Resource loadFile(String filename);

}
