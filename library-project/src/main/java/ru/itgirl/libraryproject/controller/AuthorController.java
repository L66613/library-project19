package ru.itgirl.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.libraryproject.dto.AuthorDto;
import ru.itgirl.libraryproject.service.AuthorService;
@RequestMapping(method= RequestMethod.GET, produces={"application/json; charset=UTF-8"})
@RestController
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/author/{id}")
    AuthorDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }
    @GetMapping("/author")
    AuthorDto getAuthorByName(@RequestParam("name") String name) {
        return authorService.getAuthorByName(name);
    }
    @GetMapping("/author/v1")
    AuthorDto getAuthorByNameV1(@RequestParam("name") String name) {
        return authorService.getAuthorByNameV1(name);
    }
    @GetMapping("/author/v2")
    AuthorDto getAuthorByNameV2(@RequestParam("name")String name) {
        return authorService.getAuthorByNameV2(name);
    }
}