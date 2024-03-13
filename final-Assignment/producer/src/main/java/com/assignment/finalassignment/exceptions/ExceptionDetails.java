package com.assignment.finalassignment.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetails {
    private Date date;
    private String msg;
    private HttpStatus status;
}
