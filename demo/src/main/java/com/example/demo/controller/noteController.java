package com.example.demo.controller;
import com.example.demo.entity.notes;
import com.example.demo.service.noteService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class noteController {

@Autowired
private noteService noteService;

@GetMapping("/notes")
public List<notes> getNotes(){
    return this.noteService.getAllNotes();
}
@GetMapping("/notes/{id}")
public notes getNotesById(@PathVariable("id") int id){
    return this.noteService.getNotesById(id);
}
/*@PostMapping("/notes")
public notes addNote(@RequestBody notes note){
    notes notes1= this.noteService.addNote(note);
    return notes1;
}*/
@PostMapping("/notes")
public List<notes> createMultipleNotes(@RequestBody List<notes> notesList) {
    return noteService.saveAllNotes(notesList); 
}
@DeleteMapping("/notes/{id}")
public void deleteNote(@PathVariable("id") int id){
    this.noteService.deleteNote(id);
}
@PutMapping("notes/{noteid}")
public notes updateNote(@RequestBody notes note, @PathVariable("noteid") int noteid){
    this.noteService.updateNote(note, noteid);
return note;
}

}
