package virtusa.com.a20180228_fallayediallo_nycschools.highSchools;

import java.util.List;

import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolInfo;

/**
 * Created by fallaye on 3/1/18.
 */

public interface HighSchoolContract {
    interface View {
        void showHighSchools(List<HighSchoolInfo> highSchoolInfo);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadHighSchools();
    }
}
