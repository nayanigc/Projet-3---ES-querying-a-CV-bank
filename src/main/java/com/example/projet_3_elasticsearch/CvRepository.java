package com.example.projet_3_elasticsearch;

import com.example.projet_3_elasticsearch.model.Cv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CvRepository extends CrudRepository<Cv,String> {
}
