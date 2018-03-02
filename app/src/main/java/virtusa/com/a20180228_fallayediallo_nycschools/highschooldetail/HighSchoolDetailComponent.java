package virtusa.com.a20180228_fallayediallo_nycschools.highschooldetail;

import dagger.Component;
import virtusa.com.a20180228_fallayediallo_nycschools.data.component.NetComponent;
import virtusa.com.a20180228_fallayediallo_nycschools.utils.CustomScope;

/**
 * Created by fallaye on 3/1/18.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = HighSchoolDetailModule.class)
public interface HighSchoolDetailComponent {
    void inject(HighSchoolDetailActivity activity);
}
