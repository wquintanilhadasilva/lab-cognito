package com.lab.cognito;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

    @GetMapping("/private")
    @PreAuthorize("hasAuthority('SCOPE_sblabapi/readprivate')")
    public ResponseEntity<String> getPrivate() {
        return ResponseEntity.ok("Ler Conteúdo protegido");
    }

    @GetMapping("/write")
    @PreAuthorize("hasAuthority('SCOPE_sblabapi/writeprivate')")
    public ResponseEntity<String> writePrivate() {
        return ResponseEntity.ok("Escrever Conteúdo protegido");
    }

}
