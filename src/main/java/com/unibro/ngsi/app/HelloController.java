/*
 * To change this license header, choose License Headers in UserKpi Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unibro.ngsi.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nguyenductho
 */
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello world v1", HttpStatus.OK);
    }
}
