package virtusa.com.a20180228_fallayediallo_nycschools.highSchoolDetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import virtusa.com.a20180228_fallayediallo_nycschools.App;
import virtusa.com.a20180228_fallayediallo_nycschools.R;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolDetail;

public class HighSchoolDetailActivity extends AppCompatActivity implements HighSchoolDetailContract.View{

    List<HighSchoolDetail> highSchoolDetailList;
    Bundle bundle;
    String dbn;

    @Inject
    HighSchoolDetailPresenter highSchoolDetailPresenter;
    @BindView(R.id.tvDetailSchoolName) TextView tvSchoolName;
    @BindView(R.id.tvStatTaker) TextView tvStatTaker;
    @BindView(R.id.tvCritReadAv) TextView tvCritReadAv;
    @BindView(R.id.tvMathAv) TextView tvMathAv;
    @BindView(R.id.tvWritAv) TextView tvWritAv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_school_detail);
        ButterKnife.bind(this);

        highSchoolDetailList = new ArrayList<>();

        DaggerHighSchoolDetailComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .highSchoolDetailModule(new HighSchoolDetailModule(this))
                .build().inject(this);

        highSchoolDetailPresenter.loadHighSchoolDetail();
        bundle = getIntent().getExtras();
        dbn = bundle.getString("dbn");

    }

    @Override
    public void showHighSchoolDetail(List<HighSchoolDetail> list) {
        String schoolName, statTaker, critReadAv, mathAv, writAv;

        for (int i = 0; i < list.size(); i++) {
            highSchoolDetailList.add(list.get(i));
        }

        for(HighSchoolDetail highSchoolDetail : highSchoolDetailList){

            if(highSchoolDetail.getDbn().equals(dbn)) {

                schoolName = highSchoolDetail.getSchool_name();
                statTaker = highSchoolDetail.getNum_of_sat_test_takers();
                critReadAv = highSchoolDetail.getSat_critical_reading_avg_score();
                mathAv = highSchoolDetail.getSat_math_avg_score();
                writAv = highSchoolDetail.getSat_writing_avg_score();

                tvSchoolName.setText(schoolName + "\n\n");
                tvStatTaker.setText("Num Stat Takers: " + statTaker + "\n");
                tvCritReadAv.setText("Critical Reading Av. Score: " + critReadAv  + "\n");
                tvMathAv.setText("Math Av. Score: " + mathAv + "\n");
                tvWritAv.setText("Writing Av. Score: " + writAv  + "\n");

                break;
            }
        }
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getApplicationContext(), "Error" + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showComplete() {
        Toast.makeText(getApplicationContext(), "Complete", Toast.LENGTH_SHORT).show();

    }
}
