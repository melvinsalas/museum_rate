package com.melvinsalas.museumrate.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.melvinsalas.museumrate.R;
import com.melvinsalas.museumrate.models.Exhibition;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExhibitionAdapter extends BaseAdapter {
    private final List<Exhibition> exhibitions;
    private final LayoutInflater inflater;

    public ExhibitionAdapter(Activity context, List<Exhibition> exhibitions) {
        inflater = LayoutInflater.from(context);
        this.exhibitions = exhibitions;
    }

    @Override
    public int getCount() {
        return exhibitions.size();
    }

    @Override
    public Object getItem(int position) {
        return exhibitions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @SuppressLint("SetTextI18n") //
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.exhibition_row, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        Exhibition exhibition = (Exhibition) getItem(position);
        holder.name.setText(exhibition.getName());
        holder.description.setText(exhibition.getDescription());
        Picasso.get().load(exhibition.getPicture()).into(holder.picture);

        return view;
    }

    static final class ViewHolder {
        @BindView(R.id.exhibition_picture)
        ImageView picture;
        @BindView(R.id.exhibition_name)
        TextView name;
        @BindView(R.id.exhibition_description)
        TextView description;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}



//public class CustomList extends ArrayAdapter<String> {
//    private final Activity context;
//    private final String[] web;
//
//    CustomList(Activity context,
//               String[] web) {
//        super(context, R.layout.row, web);
//        this.context = context;
//        this.web = web;
//    }
//
//    @Override
//    public View getView(int position, View view, @NonNull ViewGroup parent) {
//        LayoutInflater inflater = context.getLayoutInflater();
//        @SuppressLint({"ViewHolder", "InflateParams"}) View rowView = inflater.inflate(R.layout.row, null, true);
//        TextView txtTitle = rowView.findViewById(R.id.txt);
//        txtTitle.setText(web[position]);
//        return rowView;
//    }
//}