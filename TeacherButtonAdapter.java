package com.bignerdranch.android.basicdancenyc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TeacherButtonAdapter extends RecyclerView.Adapter<TeacherButtonAdapter.MyViewHolder> {

    public interface OnTeacherNameClickListener{
        void onTeacherNameClick(String teacherName);
    }
    private Context context;
    private ArrayList<DanceClass> theList;

    private OnTeacherNameClickListener listener;

    public TeacherButtonAdapter(Context context, ArrayList<DanceClass> theList,OnTeacherNameClickListener listener){
        this.context= context;
        this.theList = theList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TeacherButtonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflates layout and gives look to row
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);
        return new TeacherButtonAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherButtonAdapter.MyViewHolder holder, int position) {
        //assign values to rows when they come back on screen - depends on position of recycler view

        holder.textView.setText(theList.get(position).getTeacher());
        holder.imageView.setImageResource(theList.get(position).getImage());

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    // Pass the teacher name to the listener
                    listener.onTeacherNameClick(theList.get(position).getTeacher());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        // amount of items in total
        return theList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //grab views and assign them to variables

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.teacher_image);
            textView = itemView.findViewById(R.id.teacher_name);
        }
    }
}
