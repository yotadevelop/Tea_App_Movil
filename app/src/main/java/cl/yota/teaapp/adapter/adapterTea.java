package cl.yota.teaapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import cl.yota.teaapp.R;
import cl.yota.teaapp.model.Tea;

public class adapterTea extends RecyclerView.Adapter<adapterTea.TeaHolder> {
    public Activity activity;
    public List<Tea> data;
    public int item_layout;

    public adapterTea(Activity activity, List<Tea> data, int item_layout) {
        this.activity = activity;
        this.data = data;
        this.item_layout = item_layout;
    }

    @NonNull
    @Override
    public TeaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(item_layout,parent,false);
        return new TeaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeaHolder holder, int position) {
            Tea tea = data.get(position);
            holder.item_title.setText(tea.name);
            holder.item_img.setImageResource(tea.photo);
            holder.id = tea.id;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TeaHolder extends RecyclerView.ViewHolder{
        public String id;
        public ImageView item_img;
        public TextView item_title;

        public TeaHolder(View itemView) {
            super(itemView);
            item_img = itemView.findViewById(R.id.item_img);
            item_title = itemView.findViewById(R.id.item_title);
        }
    }

}//end adapter
