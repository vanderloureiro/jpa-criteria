package com.br.criteriastudy.repositories.criteria;

import java.util.List;

import com.br.criteriastudy.entities.Movie;
import com.br.criteriastudy.repositories.criteria.params.MovieFilterParam;

public interface MovieRepositoryCustom {
    
    List<Movie> getWithFilter(MovieFilterParam params);
}