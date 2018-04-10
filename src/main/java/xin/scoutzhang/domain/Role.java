package xin.scoutzhang.domain;

/**
 * Created by DEAN on 2018/4/10.
 */
public class Role {
    private String roleId;
    private String roleName;
    private String description;
    private int available = 1;

    public Role() {
    }

    public Role(String roleId, String roleName, String description, int available) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.description = description;
        this.available = available;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
