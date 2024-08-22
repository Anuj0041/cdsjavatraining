package com.blog.Anuj.controller;




import com.blog.Anuj.model.BlogModel;
import com.blog.Anuj.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

//    call the service

    @GetMapping(value = "/name")
    public String name(){
        return "Anuj Patel";
    }

    @PostMapping(value = "/add")
    public BlogModel addBlog(@RequestBody BlogModel blogModel){
        return blogService.addBlog(blogModel);
    }


}