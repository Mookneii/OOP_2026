import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Album[] album = new Album[99];
      
        int count=0;
        while(true){
            System.out.println("====== Menu ======\r\n" + //
                                "1. View a music store\r\n" + //
                                "2. Add a song\r\n" + //
                                "3. Create an album\r\n" + //
                                "4. Quit\r\n" + //
                                "Choose an option:");
            int choice = input.nextInt();
                 input.nextLine();
            switch(choice){
                case 1:
                    System.out.println("====== Music Store ======\r\n" + //
                                                "");
                    for( int j=0; j<count; j++){
                        System.out.println("Album: "+album[j].albumName);
                        if(album[j].songCount ==0){
                            System.out.println("None of song");
                        }else{
                            for(int k = 0 ; k<album[j].songCount; k++){
                                Song song = album[j].songs[k];
                                System.out.printf("| %d | %s | %s | %s | %d$ |\n",
                                        k + 1,
                                        song.title,
                                        song.singer,
                                        song.length,
                                        song.price);
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("===== Add a new song ====\r\n" + //
                                                "Select following album:");
                        for(int i =0 ; i<count;i++){
                            System.out.println(i+1+".  "+album[i].albumName);
                        }
                        System.out.print("Choose an opt:");
                        int albumChoice = input.nextInt();
                        input.nextLine();
                        if(count >= albumChoice && albumChoice >0){
                        System.out.print("Song title: ");
                        String sTitle = input.nextLine();
                        System.out.print("Singer: ");
                        String singer = input.nextLine();
                        System.out.println("Length: ");

                        String length = input.nextLine();
                        System.out.print("Price: ");
                        int price = input.nextInt();
                        input.nextLine();
                        Song newSong = new Song(sTitle, singer, length, price);
                        album[albumChoice - 1].addSong(newSong);
                        System.out.println("A new song added to the album");
                        }else{
                            System.out.println("Invalid choice!");
                        }
                        
                    break;
                case 3: 
                System.out.println("===== Create new album ====");
                System.out.print("Album title: ");
                String title = input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();
                album[count] = new Album(title, genre);
                count++;
                break;
                case 4: 
                System.out.println("Program ended");
                return;
                default: 
                System.out.println("Invalid Input");
            }   
        }
    }
}
class Song{
    String title;
    String singer;
    String length;
    int price;
    Song(String title, String singer, String length, int price){
        this.title = title;
        this.singer = singer;
        this.length = length;
        this.price = price;

    }
}
class Album{
    String albumName;
    String genre;
    Song[] songs = new Song[99];
    int songCount;

    void  addSong (Song song){
        songs[songCount] = song;
        songCount++;
       
    }
    Album(String albumName, String genre){
        this.albumName = albumName;
        this.genre = genre;

    }
}