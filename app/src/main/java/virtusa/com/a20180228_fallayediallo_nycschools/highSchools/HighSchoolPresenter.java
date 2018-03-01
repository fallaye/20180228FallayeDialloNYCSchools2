package virtusa.com.a20180228_fallayediallo_nycschools.highSchools;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import virtusa.com.a20180228_fallayediallo_nycschools.data.ApiService;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolInfo;

/**
 * Created by fallaye on 3/1/18.
 */

public class HighSchoolPresenter implements HighSchoolContract.Presenter {

    Retrofit retrofit;
    HighSchoolContract.View mView;

    @Inject
    public HighSchoolPresenter(Retrofit retrofit, HighSchoolContract.View mView) {
        this.retrofit = retrofit;
        this.mView = mView;
    }

    @Override
    public void loadHighSchools() {
        retrofit.create(ApiService.class).getHighSchoolList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<HighSchoolInfo>>() {
                    @Override
                    public void onCompleted() {
                        mView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<HighSchoolInfo> highSchoolInfos) {
                        mView.showHighSchools(highSchoolInfos);
                    }
                });
    }

}
