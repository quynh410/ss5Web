package ra.com.model;

public class Categories {
    private int  cataId;
    private String cataName;
    private String cataDepscription;
    private boolean status;

    public Categories() {
    }

    public Categories(int cataId, String cataName, String cataDepscription, boolean status) {
        this.cataId = cataId;
        this.cataName = cataName;
        this.cataDepscription = cataDepscription;
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

    public String getCataDepscription() {
        return cataDepscription;
    }

    public void setCataDepscription(String cataDepscription) {
        this.cataDepscription = cataDepscription;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
