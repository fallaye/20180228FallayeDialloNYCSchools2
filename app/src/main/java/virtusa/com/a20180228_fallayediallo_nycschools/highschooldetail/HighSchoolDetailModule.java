package virtusa.com.a20180228_fallayediallo_nycschools.highschooldetail;

import dagger.Module;
import dagger.Provides;
import virtusa.com.a20180228_fallayediallo_nycschools.utils.CustomScope;

/**
 * Created by fallaye on 3/1/18.
 */

@Module
public class HighSchoolDetailModule {

    private final HighSchoolDetailContract.View mView;

    public HighSchoolDetailModule(HighSchoolDetailContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    HighSchoolDetailContract.View providesHighSchoolDetailContractView() {
        return mView;
    }
}
