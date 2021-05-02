package com.es.sample.singleDemo.movie.service;


import com.es.sample.singleDemo.movie.repository.MovieEsRepository;
import com.es.sample.singleDemo.movie.repository.MovieJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieJpaRepository movieJpaRepository;
    private final MovieEsRepository movieEsRepository;

    public void aa(){
        movieEsRepository.saveAll(null);
    }

}
