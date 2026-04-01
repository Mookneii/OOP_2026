import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Video[] videos = new Video[100];
        int count = 3;

        // Default videos
        videos[0] = new Video("Prey Eh Kert", "Sin Sisamouth", 4);
        videos[1] = new Video("Pel Del Trov Yum", "Sinn Sisamouth", 5);
        videos[2] = new Video("Luoch Sneh Luoch Tuk", "Sinn Sisamouth", 6);

        while (true) {
            System.out.println("\n==== Menu ===");
            System.out.println("1. Search");
            System.out.println("2. View all videos");
            System.out.println("3. Add a new video");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");

            int ch = input.nextInt();
            input.nextLine();

            switch (ch) {

                case 1:
                    System.out.println("==== Video Search ====");
                    System.out.print("Input title: ");
                    String keyword = input.nextLine();

                    int found = 0;

                    for (int i = 0; i < count; i++) {
                        if (videos[i].title.toLowerCase().contains(keyword.toLowerCase())) {
                            found++;
                        }
                    }

                    if (found == 0) {
                        System.out.println("0 video found. Try again");
                    } else {
                        System.out.println(found + " videos found:");
                        int num = 1;
                        for (int i = 0; i < count; i++) {
                            if (videos[i].title.toLowerCase().contains(keyword.toLowerCase())) {
                                System.out.println(num + ". " + videos[i].title + " by " + videos[i].uploader);
                                num++;
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("==== All Videos ====");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + videos[i].title +
                                " by " + videos[i].uploader +
                                " (" + videos[i].length + " min)");
                    }
                    break;

                case 3:
                    System.out.print("Input title: ");
                    String title = input.nextLine();

                    System.out.print("Input uploader: ");
                    String uploader = input.nextLine();

                    System.out.print("Input length: ");
                    int length = input.nextInt();
                    input.nextLine();

                    videos[count] = new Video(title, uploader, length);
                    count++;

                    System.out.println("Video added successfully!");
                    break;

                case 4:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

class Video {
    String title;
    String uploader;
    int length;

    Video(String title, String uploader, int length) {
        this.title = title;
        this.uploader = uploader;
        this.length = length;
    }
}