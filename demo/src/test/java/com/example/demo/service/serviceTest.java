
package com.example.demo.service;

import com.example.demo.entity.notes;
import com.example.demo.repository.noteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // Mockito ko enable karta hai
public class serviceTest {

    @Mock
    private noteRepository repository; // Fake database repository

    @InjectMocks
    private noteService service; // Ismein fake repository inject hoga

    private notes testNote;

    @BeforeEach
    void setUp() {
        // Har test se pehle ek dummy note ready rakhte hain
        testNote = new notes();
        testNote.setId(1);
        testNote.setTitle("Test Title");
        testNote.setContent("Test Content");
    }

    @Test
    void whenSaveNote_shouldReturnSavedNote() {
        // Arrange: Batate hain ki jab repo save kare to kya return kare
        when(repository.save(any(notes.class))).thenReturn(testNote);

        // Act: Service ka method call karte hain
        notes result = service.save(testNote);

        // Assert: Check karte hain ki result wahi hai jo expect kiya tha
        assertNotNull(result);
        assertEquals("Test Title", result.getTitle());
        verify(repository, times(1)).save(any(notes.class)); // Verify calls
    }

    @Test
    void whenDeleteNote_shouldCallRepository() {
        // Act
        service.deleteNote(1);

        // Assert: Check karte hain ki delete call hua ya nahi
        verify(repository, times(1)).deleteById(1);
    }
}