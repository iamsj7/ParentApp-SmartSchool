package com.shaikjaleel.schoolx.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.shaikjaleel.schoolx.R;
import com.shaikjaleel.schoolx.model.ExamAssismentModel;
import java.util.ArrayList;


public class CbseExaminationAssismentAdapter extends  RecyclerView.Adapter<CbseExaminationAssismentAdapter.MyViewHolder> {

    Context context;

    ArrayList<ExamAssismentModel> assismentList = new ArrayList<>();
    Fragment fragment;

    public CbseExaminationAssismentAdapter(Context context, ArrayList<ExamAssismentModel> assismentList, Fragment fragment) {

        this.assismentList = assismentList;
        this.context = context;
        this.fragment = fragment;
    }


    @NonNull
    @Override
    public CbseExaminationAssismentAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.assissment_layout, parent, false);
        return new CbseExaminationAssismentAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CbseExaminationAssismentAdapter.MyViewHolder myViewHolder, int position) {
        ExamAssismentModel examAssismentModel=assismentList.get(position);
        myViewHolder.marks.setText(examAssismentModel.getMarks());
        System.out.println("Marks===="+examAssismentModel.getMarks());
        Double total_Hours = 000.00;
        total_Hours +=Double.parseDouble(examAssismentModel.getMarks());
        System.out.println("Marks Total ===="+String.valueOf(total_Hours));

    }

    @Override
    public int getItemCount() {
        return assismentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView marks;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            marks=itemView.findViewById(R.id.marks);
        }
    }

}
