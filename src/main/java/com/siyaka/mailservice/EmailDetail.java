package com.siyaka.mailservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetail {
    //"recipient@example.com", "Test Subject", "Testing Body"
    private String recipient;
    private String subject;
    private String body;
    private boolean status;
    public boolean hasDetails(){
        return recipient != null && subject != null && body != null;
    }
}
