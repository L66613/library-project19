package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
    AuthorDto getAuthorByName(String name);
    AuthorDto getAuthorByNameV1(String name);
    AuthorDto getAuthorByNameV2(String name);
}