package com.starterkit.springboot.brs.controller.v1.api;

import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.service.IBootcampService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/bootcamp")
@CrossOrigin(maxAge = 36000, origins = "*" , allowedHeaders = "*")
@Api(value = "brs-application", description = "Operations pertaining to agency management and ticket issue in the BRS application")
public class BootcampController {

    @Autowired
    IBootcampService bootcampService ;
    // Task 1 . create modal based on bootcamp that will store the whole information for the bootcamp

    // create an endpoint at "/allbootcamps"

    @GetMapping("/allbootcamps")
    @ApiOperation(value = "", authorizations = {@Authorization(value = "apiKey")})
    public ResponseEntity getAllBootcamps() {
        return ResponseEntity.ok(bootcampService.getAllBootcamps());
    }



    // Viet to implement list bootcamp

    // Jack to create bootcamp

    // Thomas to edit the bootcamp
    @PutMapping(value = "updatebootcamp", produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity updateProfile(@RequestBody BootcampDto bootcampDto){
        return ResponseEntity.ok( bootcampService.updateBootcamp(bootcampDto));
    }

    // derrick who will show all the bootcamp on react

    // kyle to register for a bootcamp

    // sabastian implement a resume uploader backend and front end



}
