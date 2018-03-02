package virtusa.com.a20180228_fallayediallo_nycschools.highschooldetail;

import java.util.List;

import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolDetail;

/**
 * Created by fallaye on 3/1/18.
 */

public interface HighSchoolDetailContract {
    interface View {
        void showHighSchoolDetail(List<HighSchoolDetail> highSchoolDetail);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadHighSchoolDetail();
    }
}
