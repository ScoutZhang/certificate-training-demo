package xin.scoutzhang.domain;

/**
 * Created by DEAN on 2018/4/10.
 */
public class User {
    private String userId;
    private String username;
    private String password;
    private String phone;
    private String icon = "/icon/default.jpg";
    private String userType;
    private String verifyIdcard;
    private String verifyName;
    private String verifyPicture;
    private int verifyStatus = -1;

    public User() {
    }

    public User(String userId, String username, String password, String phone, String icon,
                String userType, String verifyIdcard, String verifyName, String verifyPicture, int verifyStatus) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.icon = icon;
        this.userType = userType;
        this.verifyIdcard = verifyIdcard;
        this.verifyName = verifyName;
        this.verifyPicture = verifyPicture;
        this.verifyStatus = verifyStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getVerifyIdcard() {
        return verifyIdcard;
    }

    public void setVerifyIdcard(String verifyIdcard) {
        this.verifyIdcard = verifyIdcard;
    }

    public String getVerifyName() {
        return verifyName;
    }

    public void setVerifyName(String verifyName) {
        this.verifyName = verifyName;
    }

    public String getVerifyPicture() {
        return verifyPicture;
    }

    public void setVerifyPicture(String verifyPicture) {
        this.verifyPicture = verifyPicture;
    }

    public int getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(int verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", icon='" + icon + '\'' +
                ", userType='" + userType + '\'' +
                ", verifyIdcard='" + verifyIdcard + '\'' +
                ", verifyName='" + verifyName + '\'' +
                ", verifyPicture='" + verifyPicture + '\'' +
                ", verifyStatus=" + verifyStatus +
                '}';
    }
}
