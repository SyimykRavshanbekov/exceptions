package TaskZhanarbekAgai;

public enum Names {
    FIRST_NAME("имя"), SECOND_NAME("фамилию");

    private String word;

    Names(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
