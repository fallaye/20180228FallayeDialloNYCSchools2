package virtusa.com.a20180228_fallayediallo_nycschools.data;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolDetail;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolInfo;

/**
 * Created by fallaye on 3/1/18.
 */

public interface ApiService {
    @GET("/resource/97mf-9njv.json")
    Observable<List<HighSchoolInfo>> getHighSchoolList();

    @GET("/resource/734v-jeq5.json")
    Observable<List<HighSchoolDetail>> getHighSchoolDetailList();
}