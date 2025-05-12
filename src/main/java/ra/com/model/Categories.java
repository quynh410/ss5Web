package ra.com.model;

public class Categories {
    private int cataId;
    private String cataName;
    private String cataDescription;
    private boolean status;

    public Categories() {
    }

    public Categories(int cataId, String cataName, String cataDescription, boolean status) {
        this.cataId = cataId;
        this.cataName = cataName;
        this.cataDescription = cataDescription;
        this.status = status;
    }

    public int getCataId() {
        return cataId;
    }

    public void setCataId(int cataId) {
        this.cataId = cataId;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName;
    }

    public String getCataDescription() {
        return cataDescription;
    }

    public void setCataDescription(String cataDescription) {
        this.cataDescription = cataDescription;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}