package com.melvinsalas.museumrate.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Visibility;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;

import com.melvinsalas.museumrate.R;
import com.melvinsalas.museumrate.models.Exhibition;
import com.melvinsalas.museumrate.models.Rating;
import com.melvinsalas.museumrate.repositories.ExhibitionsRepository;
import com.melvinsalas.museumrate.repositories.RatingRepository;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.backdrop)
    ImageView backdrop;
    @BindView(R.id.detail_textview)
    TextView details;
    @BindView(R.id.artist_textview)
    TextView artist;
    @BindView(R.id.year_textview)
    TextView year;
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.share_fab)
    FloatingActionButton shareFab;

    Exhibition exhibition;
    Rating rating;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Bind ButterKnife
        ButterKnife.bind(this);

        // Get detail Id
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                int exhibitionId = extras.getInt("EXHIBITION_ID", 0);
                if (exhibitionId != 0) {
                    exhibition = ExhibitionsRepository.getById(exhibitionId);
                }
            }
        }

        // Set toolbar
        Picasso.get().load(exhibition.getPicture()).into(backdrop);
        toolbar.setTitle(exhibition.getName());
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        details.setText(exhibition.getDescription());
        artist.setText(exhibition.getArtist());
        year.setText(exhibition.getYear() + "");

        // RatingBar

        rating = RatingRepository.getById(this.getApplicationContext(), exhibition.getId());
        ratingBar.setRating(rating.getRate());

        ratingBar.setOnRatingBarChangeListener((ratingBar, rate, fromUser) -> {
            rating = new Rating(exhibition.getId(), rate);
            RatingRepository.save(this.getApplicationContext(), rating);
            shareFab.show();
            Snackbar.make(ratingBar, "You can share your rate", Snackbar.LENGTH_LONG).show();
        });

        shareFab.setOnClickListener(v -> {
            ShareCompat.IntentBuilder.from(this)
                    .setType("text/plain")
                    .setChooserTitle(getResources().getText(R.string.send_to))
                    .setText("I rate \"" + exhibition.getName() + "\" with " + rating.getRate() + " stars\nLook that in: " + exhibition.getPicture())
                    .startChooser();
        });
    }
}
