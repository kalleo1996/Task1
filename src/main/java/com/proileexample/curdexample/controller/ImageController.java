package com.proileexample.curdexample.controller;

import com.proileexample.curdexample.entity.ImageModel;
import com.proileexample.curdexample.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(path="check")
public class ImageController {
@Autowired
ImageRepository imageRepository;
@PostMapping("/upload")
public ImageModel uploadImage(@RequestParam("myFile") MultipartFile file) throws IOException{

    ImageModel img = new ImageModel(file.getOriginalFilename(),file.getContentType(),file.getBytes());

    final ImageModel savedImage = imageRepository.save(img);
     System.out.println("Image saved");

     return savedImage;

}

    @GetMapping("/userimgbyid/{id}")
    public ImageModel findImageModelById(@PathVariable long id){

        System.out.println("get all the images");
        return imageRepository.findById(id).orElse(null);
    }









}
