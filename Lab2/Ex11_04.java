public class Ex11_04 {
     public static void main(String[] args) {

        FacebookPost p1 = new FacebookPost();
        p1.username = "Dara";
        p1.caption = "Beautiful sunset!";
        p1.likes = 120;
        p1.comments = 15;
        p1.date = "10-03-2026";

        FacebookPost p2 = new FacebookPost();
        p2.username = "Sokha";
        p2.caption = "Traveling in Phnom Penh";
        p2.likes = 200;
        p2.comments = 25;
        p2.date = "11-03-2026";

        FacebookPost p3 = new FacebookPost();
        p3.username = "Vanna";
        p3.caption = "Coffee time";
        p3.likes = 80;
        p3.comments = 10;
        p3.date = "12-03-2026";

        FacebookPost[] posts = {p1, p2, p3};

        for (int i = 0; i < posts.length; i++) {
            System.out.println("User: " + posts[i].username);
            System.out.println("Caption: " + posts[i].caption);
            System.out.println("Likes: " + posts[i].likes);
            System.out.println("Comments: " + posts[i].comments);
            System.out.println("Date: " + posts[i].date);
            System.out.println();
        }
    }
}
class FacebookPost {

    String username;
    String caption;
    int likes;
    int comments;
    String date;
}