package com.mackenzie.heritageguardian.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private DocumentStatus documentStatus;

    public Document(Long id, String name, User user, DocumentStatus documentStatus) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.documentStatus = documentStatus;
    }

    public Document() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }
}
