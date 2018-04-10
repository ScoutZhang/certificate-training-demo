package xin.scoutzhang.domain;

/**
 * Created by DEAN on 2018/4/10.
 */
public class UserRole {
    private String urId;
    private String userId;
    private String roleId;

    public UserRole() {
    }

    public UserRole(String urId, String userId, String roleId) {
        this.urId = urId;
        this.userId = userId;
        this.roleId = roleId;
    }

    public String getUrId() {
        return urId;
    }

    public void setUrId(String urId) {
        this.urId = urId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "urId='" + urId + '\'' +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
