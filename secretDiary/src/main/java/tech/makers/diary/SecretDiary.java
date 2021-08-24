package tech.makers.diary;

public class SecretDiary {
    private Diary diary;
    private Boolean locked;

    public SecretDiary(Diary diary) {
        this.diary = diary;
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public void lock() {
        locked = true;
    }

    public String read() {
        if(locked) {
            return "Go Away!";
        } else {
            return diary.read();
        }
    }
}
