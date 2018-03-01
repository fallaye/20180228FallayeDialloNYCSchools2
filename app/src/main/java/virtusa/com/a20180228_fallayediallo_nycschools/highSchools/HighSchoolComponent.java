package virtusa.com.a20180228_fallayediallo_nycschools.highSchools;

import dagger.Component;
import virtusa.com.a20180228_fallayediallo_nycschools.data.component.NetComponent;
import virtusa.com.a20180228_fallayediallo_nycschools.utils.CustomScope;

/**
 * Created by fallaye on 3/1/18.
 */


    @CustomScope
    @Component(dependencies = NetComponent.class, modules = HighSchoolModule.class)
    public interface HighSchoolComponent {
        void inject(HighSchoolActivity activity);


}
