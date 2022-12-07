package br.com.webthyme.webthyme.model;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Task {
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date date;
}
