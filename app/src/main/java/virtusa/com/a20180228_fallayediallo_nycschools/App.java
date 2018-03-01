package virtusa.com.a20180228_fallayediallo_nycschools;

import android.app.Application;

import virtusa.com.a20180228_fallayediallo_nycschools.data.component.DaggerNetComponent;
import virtusa.com.a20180228_fallayediallo_nycschools.data.component.NetComponent;
import virtusa.com.a20180228_fallayediallo_nycschools.data.module.AppModule;
import virtusa.com.a20180228_fallayediallo_nycschools.data.module.NetModule;

/**
 * Created by fallaye on 3/1/18.
 */

public class App extends Application {

    private NetComponent mNetComponent;
    private static final String BASE_URL ="https://data.cityofnewyork.us/";

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(BASE_URL))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
