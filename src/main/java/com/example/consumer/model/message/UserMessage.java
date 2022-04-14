package com.example.consumer.model.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Transactional
public class UserMessage {

    private Long id;
    private String name;
    private String surname;
    private Boolean created;
}
