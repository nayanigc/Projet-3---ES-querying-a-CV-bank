package com.example.projet_3_elasticsearch.remote;

import com.example.projet_3_elasticsearch.model.es.EsCv;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient(name = "cv")
public interface SiteClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/cvs")
    List<EsCv> getCv();
}
