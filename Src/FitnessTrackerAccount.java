public class FitnessTrackerAccount {
    //Variables
    // /*/*/
    private String firstname;
    private int day;
    private int month;
    private int year;
    private String email;
    private int phoneNumber;
    private String surname;
    private int weight;
    private String bloodPressure;
    private int countStep;
    private int age;
    /*/*/


    //Getter & Setters
    // /*/*/
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {

        return age = 2020 - year;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getCountStep() {
        return countStep;
    }

    public void setCountStep(int countStep) {
        this.countStep = countStep;
    }
    /*/*/

    //Constructor
    // /*/*/
    public FitnessTrackerAccount() {
    }

    public FitnessTrackerAccount(String firstname, int day, int month, int year, String email, int phoneNumber, String surname, int weight, String bloodPressure, int countStep) {
        this.firstname = firstname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.countStep = countStep;
    }
    /*/*/

    public void printAccountInfo() {
        System.out.printf("Ім'я: %s %n" +
                "Прізвище: %s %n" +
                "Дата народження: %d.%d.%d %n" +
                "Вік: %d %n" +
                "Електрона пошта: %s %n" +
                "Номер телефону: %d %n" +
                "Вага: %d %n" +
                "Тиск: %s %n" +
                "Кількість кроків: %d %n%n", firstname, surname, day, month, year, getAge(), email, phoneNumber, weight, bloodPressure, countStep);
    }
}
