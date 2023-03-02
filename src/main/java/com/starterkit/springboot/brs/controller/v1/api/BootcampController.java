package com.starterkit.springboot.brs.controller.v1.api;

import com.starterkit.springboot.brs.service.IBootcampService;
import com.starterkit.springboot.brs.service.ISessionService;
import com.starterkit.springboot.brs.service.ITechnologyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/bootcamp")
@CrossOrigin(maxAge = 36000, origins = "*" , allowedHeaders = "*")
@Api(value = "brs-application", description = "Operations pertaining to agency management and ticket issue in the BRS application")
public class BootcampController {

    @Autowired
    IBootcampService bootcampService ;

    @Autowired
    ITechnologyService technologyService;

    @Autowired
    ISessionService sessionService;
    // Task 1 . create modal based on bootcamp that will store the whole information for the bootcamp

    // create an endpoint at "/allbootcamps"

    @GetMapping("/allbootcamps")
    @ApiOperation(value = "", authorizations = {@Authorization(value = "apiKey")})
    public ResponseEntity getAllBootcamps() {
        return ResponseEntity.ok(bootcampService.getAllBootcamps());
    }

    @GetMapping("/allteches")
    @ApiOperation(value = "", authorizations = {@Authorization(value = "apiKey")})
    public ResponseEntity getAllTechnologies() {
        return ResponseEntity.ok(technologyService.getAllTech());
    }

    @GetMapping("/allsessions")
    @ApiOperation(value = "", authorizations = {@Authorization(value = "apiKey")})
    public ResponseEntity getAllSessions() {
        return ResponseEntity.ok(sessionService.getAllSessions());
    }

    // Viet to implement list bootcamp

    // Jack to create bootcamp

    // Thomas to edit the bootcamp

    // derrick who will show all the bootcamp on react

    // kyle to register for a bootcamp

    // sabastian implement a resume uploader backend and front end



}
