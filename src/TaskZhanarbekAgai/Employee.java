package TaskZhanarbekAgai;

public class Employee {
    private String firstName;
    private String secondName;

    private int wasBorn;
    private int startWork;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getWasBorn() {
        return wasBorn;
    }

    public void setWasBorn(int wasBorn) {
        this.wasBorn = wasBorn;
    }

    public void getStartWork() {
        if (startWork>0){
            System.out.println(startWork);
        }else
            System.out.println("вы не можете работать");
    }

    public void setStartWork(int startWork) {
            this.startWork = startWork;
    }
}
