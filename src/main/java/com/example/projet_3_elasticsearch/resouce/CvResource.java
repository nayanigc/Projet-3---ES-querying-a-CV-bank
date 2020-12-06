package com.example.projet_3_elasticsearch.resouce;

import com.example.projet_3_elasticsearch.model.Cv;
import com.example.projet_3_elasticsearch.resouce.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class CvResource {

    @Autowired
    CvService cvService;
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    
    //Cherche une tag en commun
    @RequestMapping(value = "/cv",method = RequestMethod.POST)
    public List<Cv> search_cv (@RequestParam("tag") String tag) throws IOException {
        return cvService.findAlltag(tag);
    }


    @PostMapping(value = "/add")
    public String create(@RequestParam("file") MultipartFile file) throws IOException {
       return  cvService.save(file);
    }

    @RequestMapping(value = "/search" , method = RequestMethod.GET)
    public List<Cv> search (){
        return cvService.searchAll();
    }
}
