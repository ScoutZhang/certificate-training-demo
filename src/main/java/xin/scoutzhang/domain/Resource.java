package xin.scoutzhang.domain;

/**
 * Created by DEAN on 2018/4/10.
 */
public class Resource {
    private String resourceId;
    private String resourceName;
    private String description;
    private int available = 1;

    public Resource() {
    }

    public Resource(String resourceId, String resourceName, String description, int available) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.description = description;
        this.available = available;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        return "Resource{" +
                "resourceId='" + resourceId + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
