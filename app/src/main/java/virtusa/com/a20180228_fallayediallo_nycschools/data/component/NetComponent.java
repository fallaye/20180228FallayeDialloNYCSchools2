package virtusa.com.a20180228_fallayediallo_nycschools.data.component;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;
import virtusa.com.a20180228_fallayediallo_nycschools.data.module.AppModule;
import virtusa.com.a20180228_fallayediallo_nycschools.data.module.NetModule;

/**
 * Created by fallaye on 3/1/18.
 *
 */


@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
