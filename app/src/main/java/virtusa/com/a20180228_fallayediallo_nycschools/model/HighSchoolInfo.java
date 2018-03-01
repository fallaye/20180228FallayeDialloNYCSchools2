package virtusa.com.a20180228_fallayediallo_nycschools.model;

/**
 * Created by fallaye on 3/1/18.
 */

public class HighSchoolInfo {
    private String dbn, school_name, location,
            phone_number, website, school_email;

    public HighSchoolInfo() {
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public HighSchoolInfo(String dbn, String school_name, String location, String phone_number, String website, String school_email) {
        this.dbn = dbn;
        this.school_name = school_name;
        this.location = location;
        this.phone_number = phone_number;
        this.website = website;
        this.school_email = school_email;
    }

    public String getSchool_name() {

        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSchool_email() {
        return school_email;
    }

    public void setSchool_email(String school_email) {
        this.school_email = school_email;
    }

    @Override
    public String toString() {
        return "HighSchoolInfo{" +
                "school_name='" + school_name + '\'' +
                ", location='" + location + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", website='" + website + '\'' +
                ", school_email='" + school_email + '\'' +
                '}';
    }
}
