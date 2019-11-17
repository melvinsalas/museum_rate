package com.melvinsalas.museumrate.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.melvinsalas.museumrate.MainActivity;
import com.melvinsalas.museumrate.R;
import com.melvinsalas.museumrate.adapters.ExhibitionAdapter;
import com.melvinsalas.museumrate.models.Exhibition;
import com.melvinsalas.museumrate.repositories.ExhibitionsRepository;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExhibitionsActivity extends AppCompatActivity {
    @BindView(R.id.exhibitions_list)
    ListView exhibitionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibitions);

        // Bind ButterKnife
        ButterKnife.bind(this);

        ExhibitionAdapter adapter = new ExhibitionAdapter(this, ExhibitionsRepository.getAll());
        exhibitionList.setAdapter(adapter);
        exhibitionList.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(ExhibitionsActivity.this, DetailActivity.class);
            Exhibition exhibition = (Exhibition)parent.getAdapter().getItem(position);
            intent.putExtra("EXHIBITION_ID", exhibition.getId());
            startActivity(intent);
        });
    }
}
