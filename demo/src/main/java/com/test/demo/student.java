package com.test.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Specifies that the class is an entity (jakarta)
@Entity
//Creates a table in data base with its name (jakarta)
@Table(name = "STUDENT")
//Automatically creates getter and setter (lombok)
@Data
//It creates a default constructor for your class that takes no parameters. 
@NoArgsConstructor
// It creates a constructor that takes one argument for each field in your class.
@AllArgsConstructor
public class student {
    // create a column id as a primary key
    @Id
    // to specify name of the column
    @Column(name = "ID")
    //Automatically increment column id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "MARK")
    private int mark;
    @Column(name = "NAME")
    private String name;
    
}
