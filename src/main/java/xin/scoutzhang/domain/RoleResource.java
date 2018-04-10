package xin.scoutzhang.domain;

/**
 * Created by DEAN on 2018/4/10.
 */
public class RoleResource {
    private String rrId;
    private String roleId;
    private String resourceId;

    public RoleResource() {
    }

    public RoleResource(String rrId, String roleId, String resourceId) {
        this.rrId = rrId;
        this.roleId = roleId;
        this.resourceId = resourceId;
    }

    public String getRrId() {
        return rrId;
    }

    public void setRrId(String rrId) {
        this.rrId = rrId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "RoleResource{" +
                "rrId='" + rrId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                '}';
    }
}
