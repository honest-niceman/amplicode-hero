package io.amplicode.amplicodehero.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Ascxa {

    @Id
    private String id;



}