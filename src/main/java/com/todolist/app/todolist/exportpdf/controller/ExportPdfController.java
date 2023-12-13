package com.todolist.app.todolist.exportpdf.controller;

import com.itextpdf.text.DocumentException;
import com.todolist.app.todolist.exportpdf.services.ExportPdfServices;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class ExportPdfController {

    private final ExportPdfServices exportPdfServices;

    @GetMapping("/generate")
    public ResponseEntity<ByteArrayResource> generatePdf() throws DocumentException {
        byte[] pdfContent = exportPdfServices.generatePdf2();

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=example.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new ByteArrayResource(pdfContent));
    }
}
