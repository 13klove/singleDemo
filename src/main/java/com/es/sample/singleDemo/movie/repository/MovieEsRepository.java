package com.es.sample.singleDemo.movie.repository;


import com.es.sample.singleDemo.movie.model.es.Movie;
import com.es.sample.singleDemo.movie.status.Genre;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface MovieEsRepository extends ElasticsearchRepository<Movie, Long> {

    List<Movie> findMoviesByGenre(Genre genre);

    SearchHits<Movie> findMovieByGenre(Genre genre);

    SearchHits<Movie> findMoviesByMovieEnName(String movieEnName);

    List<Movie> findMovieByGenre(Genre genre, Pageable pageable);

    List<Movie> findMovieByGenreOrderByMovieNameAsc(Genre genre, Pageable pageable);

    List<Movie> findMovieByGenreOrderByAgeAsc(Genre genre, Pageable pageable);

}
