package com.melvinsalas.museumrate.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.melvinsalas.museumrate.R;
import com.melvinsalas.museumrate.adapters.ExhibitionAdapter;
import com.melvinsalas.museumrate.repositories.ExhibitionsRepository;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExhibitionsActivity extends AppCompatActivity {
    @BindView(R.id.exhibitions_list)
    ListView exhibitionList;


    private ExhibitionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibitions);

        ButterKnife.bind(this);

        adapter = new ExhibitionAdapter(this, ExhibitionsRepository.getAll());
        exhibitionList.setAdapter(adapter);
    }
}
