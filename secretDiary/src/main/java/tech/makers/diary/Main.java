package tech.makers.diary;

public class Main {
    public static void main(String[] args) {
        Diary diary = new Diary(1111);
        SecretDiary secretDiary = new SecretDiary(diary);

        System.out.println(secretDiary.read());

        secretDiary.unlock();
        System.out.println(secretDiary.read());

    }
}
