package bean;


public class ItemBean {
    private String trueName;
    private String mobile;
    private String workMobile;
    private String telePhone;
    private String email;

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWorkMobile() {
        return workMobile;
    }

    public void setWorkMobile(String workMobile) {
        System.out.println(workMobile);

        this.workMobile = workMobile;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "ItemBean{" +
                "trueName='" + trueName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", workMobile='" + workMobile + '\'' +
                ", telePhone='" + telePhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
