package virtusa.com.a20180228_fallayediallo_nycschools.highschooldetail;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import virtusa.com.a20180228_fallayediallo_nycschools.data.ApiService;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolDetail;

/**
 * Created by fallaye on 3/1/18.
 */

public class HighSchoolDetailPresenter implements HighSchoolDetailContract.Presenter {

    Retrofit retrofit;
    HighSchoolDetailContract.View mView;

    @Inject
    public HighSchoolDetailPresenter(Retrofit retrofit, HighSchoolDetailContract.View mView) {
        this.retrofit = retrofit;
        this.mView = mView;
    }

    @Override
    public void loadHighSchoolDetail() {
        retrofit.create(ApiService.class).getHighSchoolDetailList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<HighSchoolDetail>>() {
                    @Override
                    public void onCompleted() {
                        mView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<HighSchoolDetail> highSchoolDetails) {
                        mView.showHighSchoolDetail(highSchoolDetails);
                    }
                });
    }

}

