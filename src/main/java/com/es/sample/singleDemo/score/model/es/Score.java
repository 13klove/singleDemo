package com.es.sample.singleDemo.score.model.es;

import com.es.sample.singleDemo.score.status.Rater;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "movie")
public class Score {

    private Rater rater;

    private Double point;

}
