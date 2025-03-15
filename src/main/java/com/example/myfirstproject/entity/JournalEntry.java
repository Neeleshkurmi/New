package com.example.myfirstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "journal_myCollection")
public class JournalEntry {
    @Id
    private ObjectId id ;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;

}
