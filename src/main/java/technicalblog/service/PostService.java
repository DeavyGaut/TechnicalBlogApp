package technicalblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import technicalblog.repository.PostRepository;

import java.sql.Connection;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public PostService() {
        System.out.println("*** PostService ***");
    }

    public List<Post> getAllPosts() {

        return repository.getAllPosts();
    }

    Connection connection = null;

    public Post getOnePost() {

        return repository.getLatestPost();

    }

    public void createPost(Post newPost) {
    }
}