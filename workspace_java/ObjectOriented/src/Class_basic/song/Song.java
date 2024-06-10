package Class_basic.song;

public class Song {
    String title;
    String artist;
    String album;
    int year;
    String[] composer = new String[3];


    public void setInfo(String a, String b, String c, int d, String[] e){
        title = a;
        artist = b;
        album = c;
        year = d;
        composer = e;

    }
    public void introSong(){
        System.out.println("제목 : " + title);
        System.out.println("가스 : " + artist);
        System.out.println("앨범 : " + album);
        System.out.println("년도 : " + year);
        System.out.print("작곡가 : ");
        for (int i = 0; i < composer.length; i++){
            System.out.print(composer[i] + " ");
        }
    }
}
