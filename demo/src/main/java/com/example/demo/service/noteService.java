package com.example.demo.service;
import com.example.demo.repository.noteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.notes;
import java.util.*;
@Service
public class noteService {
@Autowired
private noteRepository noteRepository;
public List<notes> getAllNotes() {
    List<notes> notes = noteRepository.findAll();
    return notes;

}/* 
public notes getNotesById(int id) {
    notes note= noteRepository.findById(id);
    return note;
}
    */
public notes getNotesById(int id) {
    return noteRepository.findById(id).orElse(null);
}

/* 
public notes addNote(notes note) {
    notes newNote= noteRepository.save(note);
  return newNote;
}*/
public List<notes> saveAllNotes(List<notes> notesList) {
        return noteRepository.saveAll(notesList);
}
public void deleteNote(int id) {
    noteRepository.deleteById(id);
    
}
public void updateNote(notes note, int noteid){
note.setId(noteid);
noteRepository.save(note);

}
public notes save(notes note) {
    return noteRepository.save(note);
}
}
