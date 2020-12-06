package com.example.projet_3_elasticsearch.model.es;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;

@Document(indexName = "cv")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class EsCv {
    @Id
    private Long id;
}
