package com.blog.Anuj.services;

import com.blog.Anuj.model.BlogModel;
import org.springframework.stereotype.Component;






import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

    @Component
    public class BlogService {
//    ADD BLOG
//    GET BLOG
//    DELETE BLOG
//    UPDATE BLOG
//    GET ALL BLOGS


        //    to set the initial blogId = 1
        private int id = 1;

        //    to add the data into collection class list
        List<BlogModel> blog = new CopyOnWriteArrayList<>();

        public  BlogModel addBlog(BlogModel blogModel){

            blogModel.setBlogId(id);
            blog.add(blogModel);
            id++;
            return blogModel;







        }

    }

