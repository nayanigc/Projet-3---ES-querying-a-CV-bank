package com.example.projet_3_elasticsearch.resouce.service;

import com.example.projet_3_elasticsearch.CvRepository;
import com.example.projet_3_elasticsearch.model.Cv;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CvService {

    private String monfichier;
    @Autowired
    private CvRepository cvRepository;

    private String [] tagList = {"Java","JAVA","Ocaml","JS","C","C++","C#","Python","PHP"};
    public String  save(MultipartFile file) throws IOException {
        String tag = recup(file);
        Cv cv = new Cv(file.getName(),file.getContentType(),file.getBytes(),tag);
        cvRepository.save(cv);
        return "Succès";
    }

    public List<Cv> findAlltag (String tag) throws IOException {
      List<Cv> cvList = new ArrayList<>();
      Iterable<Cv>cvses = cvRepository.findAll();
      for(Cv cv : cvses) {
          if(cv.getTag().contains(tag)){
              cvList.add(cv);
         }
     }
        return cvList;
    }

    public void delete(String id) {
        cvRepository.deleteById(id);

    }

    public List<Cv> searchAll (){
        List<Cv> cvsList = new ArrayList<>();
        Iterable<Cv>cvses = cvRepository.findAll();
        cvses.forEach(cvsList::add);
        return cvsList;
    }

    public String recup (MultipartFile file) throws IOException {
        String tag = " ";
        //application/pdf application/vnd.oasis.opendocument.text
        PDDocument document = PDDocument.load(file.getBytes());
        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();
        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);
        //System.out.println(text);
        //Closing the document
        document.close();

        for(String s : tagList){
            if (text.contains(s)){
                tag = s + " " + tag;

            }
        }
            return tag;

    }

}
