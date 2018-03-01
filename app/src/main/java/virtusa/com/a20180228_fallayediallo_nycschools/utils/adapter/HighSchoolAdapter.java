package virtusa.com.a20180228_fallayediallo_nycschools.utils.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import virtusa.com.a20180228_fallayediallo_nycschools.R;
import virtusa.com.a20180228_fallayediallo_nycschools.model.HighSchoolInfo;

/**
 * Created by fallaye on 3/1/18.
 */

public class HighSchoolAdapter extends RecyclerView.Adapter<HighSchoolAdapter.HighSchoolViewHolder> {

    private Context mCtx;

    private List<HighSchoolInfo> highSchoolList;

    public HighSchoolAdapter(Context mCtx, List<HighSchoolInfo> HighSchoolList) {
        this.mCtx = mCtx;
        this.highSchoolList = HighSchoolList;
    }

    @Override
    public HighSchoolViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.high_school, null);
        return new HighSchoolViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HighSchoolViewHolder holder, int position) {
        final HighSchoolInfo highSchoolInfo = highSchoolList.get(position);

        holder.textViewSchoolName.setText(highSchoolInfo.getSchool_name());
        holder.textViewLocation.setText(highSchoolInfo.getLocation());
        holder.textViewPhoneNumber.setText(String.valueOf(highSchoolInfo.getPhone_number()));
        holder.textViewWebsite.setText(String.valueOf(highSchoolInfo.getWebsite()));
        holder.textViewEmail.setText(String.valueOf(highSchoolInfo.getSchool_email()));

    }

    @Override
    public int getItemCount() {
        return highSchoolList.size();
    }

    class HighSchoolViewHolder extends RecyclerView.ViewHolder {

        TextView textViewSchoolName, textViewLocation, textViewPhoneNumber, textViewWebsite, textViewEmail;

        public HighSchoolViewHolder(View itemView) {
            super(itemView);

            textViewSchoolName = itemView.findViewById(R.id.tvSchoolName);
            textViewLocation = itemView.findViewById(R.id.tvLocation);
            textViewPhoneNumber = itemView.findViewById(R.id.tvPhoneNumber);
            textViewWebsite = itemView.findViewById(R.id.tvWebsite);
            textViewEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
}