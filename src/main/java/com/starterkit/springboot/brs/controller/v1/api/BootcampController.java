package com.starterkit.springboot.brs.controller.v1.api;

import com.starterkit.springboot.brs.controller.v1.request.bootcamp.UpdateBootcampRequest;
import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.exception.LearnerDromeException;
import com.starterkit.springboot.brs.service.IBootcampService;
import com.starterkit.springboot.brs.service.ISessionService;
import com.starterkit.springboot.brs.service.ITechnologyService;
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

    @Autowired
    ITechnologyService technologyService;

    @Autowired
    ISessionService sessionService;

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

    @PutMapping(value = "updatebootcamp", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "", authorizations = {@Authorization(value = "apiKey")})
    public  ResponseEntity updateProfile(@RequestBody BootcampDto bootcampDto){
        return ResponseEntity.ok( bootcampService.updateBootcamp(bootcampDto));
    }

    @PutMapping(value = "adduserbootcamp", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "", authorizations = {@Authorization(value = "apiKey")})
    public  ResponseEntity addUserToBootcamp(@RequestBody UpdateBootcampRequest bootcampRequest) throws LearnerDromeException {
        return ResponseEntity.ok( bootcampService.updateUsersBootcamp(bootcampRequest));
    }
}
