package com.webgalaxie.blischke.bachelortakeone.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.webgalaxie.blischke.bachelortakeone.Models.Expose;
import com.webgalaxie.blischke.bachelortakeone.R;

import java.util.List;

/**
 * Created by Bexx on 04.11.17.
 */

public class ExposeAdapter extends RecyclerView.Adapter<ExposeAdapter.ExposeViewHolder> {

    private Context context;
    private List<Expose> exposeList;

    public ExposeAdapter(Context context, List<Expose> exposeList) {
        this.context = context;
        this.exposeList = exposeList;
    }

    @Override
    public ExposeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_cardview_expose_list, null);

        return new ExposeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExposeViewHolder holder, int position) {
        Expose expose = exposeList.get(position);
        holder.cardviewTitle.setText(expose.getExposeTitle());
        holder.cardviewID.setText(expose.getExpose_id());
        holder.cardviewAdress.setText(expose.getExposeAdress());
        holder.cardviewDate.setText(expose.getExposeDate());

        holder.cardviewImage.setImageDrawable(context.getResources().getDrawable(expose.getImage()));
    }

    @Override
    public int getItemCount() {
        return exposeList.size();
    }

    class ExposeViewHolder extends RecyclerView.ViewHolder {
        ImageView cardviewImage;
        TextView cardviewID, cardviewTitle, cardviewAdress, cardvieeStatus, cardviewDate;

        public ExposeViewHolder(View itemView) {
            super(itemView);

            cardviewImage = itemView.findViewById(R.id.cardviewImage);
            cardviewID = itemView.findViewById(R.id.cardviewID);
            cardviewTitle = itemView.findViewById(R.id.cardviewTitle);
            cardviewAdress = itemView.findViewById(R.id.cardviewAdress);
            cardvieeStatus = itemView.findViewById(R.id.cardViewStatus);
            cardviewDate = itemView.findViewById(R.id.cardviewDate);
        }
    }
}
