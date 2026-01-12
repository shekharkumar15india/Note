package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class notes {
@Id    
private int id;
private String title;
private String content;
private String summary;
public String getSummary() {
    return summary;
}
public void setSummary(String summary) {
    this.summary = summary;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getContent() {
    return content;
}
public void setContent(String content) {
    this.content = content;
}

}
