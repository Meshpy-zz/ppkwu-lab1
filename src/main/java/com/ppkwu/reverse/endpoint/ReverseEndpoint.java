package com.ppkwu.reverse.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReverseEndpoint {

    @RequestMapping(method = RequestMethod.GET, path = "/reverse/{data}")
    public ResponseEntity<String> reverse(@PathVariable String data) {
        StringBuilder reversedData = new StringBuilder(data);
        return ResponseEntity.ok(reversedData.reverse().toString());
    }

}