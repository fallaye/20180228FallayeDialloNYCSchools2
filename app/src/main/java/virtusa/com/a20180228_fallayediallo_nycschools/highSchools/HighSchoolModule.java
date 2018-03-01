package virtusa.com.a20180228_fallayediallo_nycschools.highSchools;

import dagger.Module;
import dagger.Provides;
import virtusa.com.a20180228_fallayediallo_nycschools.utils.CustomScope;

/**
 * Created by fallaye on 3/1/18.
 */
@Module
public class HighSchoolModule {

    private final HighSchoolContract.View mView;


    public HighSchoolModule(HighSchoolContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    HighSchoolContract.View providesHighSchoolContractView() {
        return mView;
    }
}
