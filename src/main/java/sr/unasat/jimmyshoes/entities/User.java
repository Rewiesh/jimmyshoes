package sr.unasat.jimmyshoes.entities;

import javax.persistence.*;

@Entity(name = "user")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "mobilenumber")
    private Integer mobileNumber;

    @Column(name = "telefoonnumber")
    private Integer phoneNumber;

    public User() {}

    public User(String userName, String passWord, String firstName, String lastName, String secondName, Integer mobileNumber, Integer phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.phoneNumber = phoneNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

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

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
