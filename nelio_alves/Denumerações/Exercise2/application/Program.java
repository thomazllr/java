package nelio_alves.Denumerações.Exercise2.application;

import nelio_alves.Denumerações.Exercise2.entities.Comment;
import nelio_alves.Denumerações.Exercise2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        post.addComments(comment1);
        post.addComments(comment2);

        System.out.println(post);




    }
}
