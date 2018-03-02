package virtusa.com.a20180228_fallayediallo_nycschools.highschools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import virtusa.com.a20180228_fallayediallo_nycschools.App;
import virtusa.com.a20180228_fallayediallo_nycschools.R;
import virtusa.com.a20180228_fallayediallo_nycschools.highschooldetail.HighSchoolDetailActivity;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolInfo;
import virtusa.com.a20180228_fallayediallo_nycschools.utils.RecyclerItemClickListener;
import virtusa.com.a20180228_fallayediallo_nycschools.utils.adapter.HighSchoolAdapter;

public class HighSchoolActivity extends AppCompatActivity implements HighSchoolContract.View{

    List<HighSchoolInfo> highSchoolList;
    RecyclerView recyclerView;
    HighSchoolAdapter adapter;

    @Inject
    HighSchoolPresenter highSchoolPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_school);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        highSchoolList = new ArrayList<>();

        DaggerHighSchoolComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .highSchoolModule(new HighSchoolModule(this))
                .build().inject(this);

        highSchoolPresenter.loadHighSchools();

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        Intent intent = new Intent(getApplicationContext(), HighSchoolDetailActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("dbn", highSchoolList.get(position).getDbn());
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {

                    }
                })
        );

    }

    @Override
    public void showHighSchools(List<HighSchoolInfo> list) {
        for (int i = 0; i < list.size(); i++) {
            highSchoolList.add(list.get(i));
        }

        adapter = new HighSchoolAdapter(this, highSchoolList);
        recyclerView.setAdapter(adapter);
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
