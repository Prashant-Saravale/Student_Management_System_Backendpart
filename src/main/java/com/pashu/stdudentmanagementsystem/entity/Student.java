package com.pashu.stdudentmanagementsystem.entity;



import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
@Id
private int roll;
private String name;
private int percentage;
private String clss;

}

