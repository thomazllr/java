package nelio_alves.Denumerações.StringBuilder.application;
import nelio_alves.Denumerações.StringBuilder.entities.Comment;
import nelio_alves.Denumerações.StringBuilder.entities.Post;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        post.addComments(comment1);
        post.addComments(comment2);

        System.out.println(post);

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
        Comment comment3 = new Comment("Good night!");
        Comment comment4 = new Comment("May the Force be with you");
        post2.addComments(comment3);
        post2.addComments(comment4);

        System.out.println(post2);


    }
}
