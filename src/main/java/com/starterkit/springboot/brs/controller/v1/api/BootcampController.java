package com.starterkit.springboot.brs.controller.v1.api;

import com.starterkit.springboot.brs.service.IBootcampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/bootcamp")
public class BootcampController {

    @Autowired
    IBootcampService bootcampService ;
    // Task 1 . create modal based on bootcamp that will store the whole information for the bootcamp

    // create an endpoint at "/allbootcamps"

    @GetMapping("/allbootcamps")
    public ResponseEntity getAllBootcamps() {
        return ResponseEntity.ok(bootcampService.getAllBootcamps());
    }



    // Viet to implement list bootcamp

    // Jack to create bootcamp

    // Thomas to edit the bootcamp

    // derrick who will show all the bootcamp on react

    // kyle to register for a bootcamp

    // sabastian implement a resume uploader backend and front end



}
