class User {
    String username;
    String email;
    int subscribers;
    String country;
    int age;

    User(String username, String email, int subscribers, String country, int age) {
        this.username = username;
        this.email = email;
        this.subscribers = subscribers;
        this.country = country;
        this.age = age;
    }
}

class Video {
    String title;
    int duration;
    int views;
    String category;
    String uploadDate;
    User user;

    Video(String title, int duration, int views, String category, String uploadDate, User user) {
        this.title = title;
        this.duration = duration;
        this.views = views;
        this.category = category;
        this.uploadDate = uploadDate;
        this.user = user;
    }

    void display() {
        System.out.println(title + " | " + duration + " mins | Views: " + views +
                " | Category: " + category +
                " | By: " + user.username);
    }
}

public class Ex8_2 {
    public static void main(String[] args) {
        User u1 = new User("TolaTV", "tola@gmail.com", 1000, "Cambodia", 20);
        User u2 = new User("MakaraYT", "makara@gmail.com", 500, "Cambodia", 22);

        Video v1 = new Video("Java Tutorial", 15, 2000, "Education", "2025", u1);
        Video v2 = new Video("Gaming", 20, 3000, "Entertainment", "2025", u2);
        Video v3 = new Video("Vlog", 10, 1500, "Lifestyle", "2025", u1);

        Video[] videos = {v1, v2, v3};

        for (Video v : videos) {
            v.display();
        }
    }
}