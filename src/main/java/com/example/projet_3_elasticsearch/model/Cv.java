package com.example.projet_3_elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Cv {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  int id = 0;
    private String name;
    @Column(name = "tag")
    private String tag;

    private String description;
    @Lob
    private byte[] file;


    public Cv(String name, String contentType, byte[] bytes, String tag) {
        this.name =name;
        this.description = contentType;
        this.file = bytes;
        this.tag = tag;
        this.id = this.id++;
    }


    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getFile() {
        return file;
    }
}
