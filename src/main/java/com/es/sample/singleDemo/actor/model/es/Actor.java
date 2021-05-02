package com.es.sample.singleDemo.actor.model.es;

import com.es.sample.singleDemo.actor.status.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "movie")
public class Actor {

    @Id
    private Long actorId;

    private String name;

    private Gender gender;

}
