package com.samsoftware.kafka.payload;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private int id;
    private String firstname;
    private String lastname;
}
