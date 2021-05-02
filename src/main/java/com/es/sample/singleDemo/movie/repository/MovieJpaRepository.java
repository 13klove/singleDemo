package com.es.sample.singleDemo.movie.repository;

import com.es.sample.singleDemo.movie.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJpaRepository extends JpaRepository<Movie, Long> {



}
