package com.example.demo.repository;
import com.example.demo.entity.notes;
import org.springframework.data.jpa.repository.JpaRepository;
public interface noteRepository extends JpaRepository<notes, Integer> {

}
