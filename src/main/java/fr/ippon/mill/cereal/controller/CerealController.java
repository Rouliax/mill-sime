package fr.ippon.mill.cereal.controller;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import org.slf4j.*;



@RestController
@RequestMapping("/api/cereals")
@Validated
public class CerealController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CerealController.class);

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody PostCerealDeposit postCerealDeposit) {
        LOGGER.info("cereal:{}", postCerealDeposit.getIdCereal());
        return ResponseEntity.created(URI.create("")).build();
        
    }
}
