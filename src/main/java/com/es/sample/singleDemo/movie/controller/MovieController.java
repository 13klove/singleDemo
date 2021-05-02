package com.es.sample.singleDemo.movie.controller;

import com.es.sample.singleDemo.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;


}
