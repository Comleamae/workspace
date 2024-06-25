package class_basic.song;

public class SongTest {
    public static void main(String[] args) {
        Song sg1 = new Song();
        String[] comm = {"김", "이", "박"};
        sg1.introSong();
        sg1.setInfo("제목","가수", "1집", 2024, comm);
        sg1.introSong();
    }
}
