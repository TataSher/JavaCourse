package tech.makers.diary;

public class Diary {
    private String contents;

    public Diary(String contents) {
        this.contents = contents;
    }

    public String read() {
        return contents;
    }
}
