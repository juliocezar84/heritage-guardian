package com.mackenzie.heritageguardian.dtos;

import com.mackenzie.heritageguardian.entities.Document;
import com.mackenzie.heritageguardian.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private String name;
    private List<DocumentDTO> documents = new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(User user) {
        name = user.getName();
        documents = user.getDocuments().stream().map(document -> new DocumentDTO(document)).toList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DocumentDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentDTO> documents) {
        this.documents = documents;
    }
}
