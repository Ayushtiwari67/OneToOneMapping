package com.example.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

@Getter
@Setter
public class StudentDto  {
   private Long id;
   private String name;
   private String subject;
}