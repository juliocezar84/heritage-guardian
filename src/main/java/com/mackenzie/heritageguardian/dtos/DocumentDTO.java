package com.mackenzie.heritageguardian.dtos;

import com.mackenzie.heritageguardian.entities.Document;
import com.mackenzie.heritageguardian.entities.DocumentStatus;

public class DocumentDTO {
    private String name;
    private DocumentStatus documentStatus;

    public DocumentDTO() {
    }
    public DocumentDTO(Document document) {
        name = document.getName();
        documentStatus = document.getDocumentStatus();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }
}
