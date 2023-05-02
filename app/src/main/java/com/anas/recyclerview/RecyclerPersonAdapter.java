package com.anas.recyclerview;

import static com.anas.recyclerview.R.id.imgPerson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerPersonAdapter extends RecyclerView.Adapter<RecyclerPersonAdapter.ViewHolder> {

    Context context;
    ArrayList<person_data> arrPdata=new ArrayList<>();
    RecyclerPersonAdapter(Context context, ArrayList<person_data> arrPdata){
        this.context=context;
        this.arrPdata=arrPdata;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.person_row,parent,false);
        ViewHolder vh= new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgPerson.setImageResource(arrPdata.get(position).img);
        holder.txtpname.setText(arrPdata.get(position).name);
        holder.txtpno.setText(arrPdata.get(position).phone);
    }

    @Override
    public int getItemCount() {
        return arrPdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPerson;
        TextView txtpname,txtpno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPerson=itemView.findViewById(R.id.imgPerson);
            txtpname=itemView.findViewById(R.id.txtpname);
            txtpno=itemView.findViewById(R.id.txtpno);
        }
    }
}
