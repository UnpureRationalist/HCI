package example.org.hci.entity;

public class Questions {
    private int ID;
    private String content;
    private String choose1;
    private String choose2;
    private String choose3;
    private String choose4;
    private int answer;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChoose1() {
        return choose1;
    }

    public void setChoose1(String choose1) {
        this.choose1 = choose1;
    }

    public String getChoose2() {
        return choose2;
    }

    public void setChoose2(String choose2) {
        this.choose2 = choose2;
    }

    public String getChoose3() {
        return choose3;
    }

    public void setChoose3(String choose3) {
        this.choose3 = choose3;
    }

    public String getChoose4() {
        return choose4;
    }

    public void setChoose4(String choose4) {
        this.choose4 = choose4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
