package virtusa.com.a20180228_fallayediallo_nycschools.model;

import java.io.Serializable;

/**
 * Created by fallaye on 3/1/18.
 */

public class HighSchoolDetail implements Serializable{

    private String dbn, school_name, num_of_sat_test_takers,
            sat_critical_reading_avg_score, sat_math_avg_score, sat_writing_avg_score;

    public HighSchoolDetail() {
    }

    public HighSchoolDetail(String dbn, String school_name, String num_of_sat_test_takers, String sat_critical_reading_avg_score, String sat_math_avg_score, String sat_writing_avg_score) {
        this.dbn = dbn;
        this.school_name = school_name;
        this.num_of_sat_test_takers = num_of_sat_test_takers;
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
        this.sat_math_avg_score = sat_math_avg_score;
        this.sat_writing_avg_score = sat_writing_avg_score;
    }

    public String getSchool_name() {

        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getNum_of_sat_test_takers() {
        return num_of_sat_test_takers;
    }

    public void setNum_of_sat_test_takers(String num_of_sat_test_takers) {
        this.num_of_sat_test_takers = num_of_sat_test_takers;
    }

    public String getSat_critical_reading_avg_score() {
        return sat_critical_reading_avg_score;
    }

    public void setSat_critical_reading_avg_score(String sat_critical_reading_avg_score) {
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
    }

    public String getSat_math_avg_score() {
        return sat_math_avg_score;
    }

    public void setSat_math_avg_score(String sat_math_avg_score) {
        this.sat_math_avg_score = sat_math_avg_score;
    }

    public String getSat_writing_avg_score() {
        return sat_writing_avg_score;
    }

    public void setSat_writing_avg_score(String sat_writing_avg_score) {
        this.sat_writing_avg_score = sat_writing_avg_score;
    }

    @Override
    public String toString() {
        return "HighSchoolDetail{" +
                "school_name='" + school_name + '\'' +
                ", num_of_sat_test_takers='" + num_of_sat_test_takers + '\'' +
                ", sat_critical_reading_avg_score='" + sat_critical_reading_avg_score + '\'' +
                ", sat_math_avg_score='" + sat_math_avg_score + '\'' +
                ", sat_writing_avg_score='" + sat_writing_avg_score + '\'' +
                '}';
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }
}
