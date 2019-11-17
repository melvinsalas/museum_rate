package com.melvinsalas.museumrate.repositories;

import android.content.Context;
import android.content.SharedPreferences;

import com.melvinsalas.museumrate.models.Rating;

public class RatingRepository {
    // Variable to use SharedPreferences
    private final static String NAME = "com.melvinsalas.museumrate";
    private final static String RATE_PREFIX = "rate_";

    /**
     * Save rating on database
     * @param context Application context
     * @param rating Rating to save
     */
    public static void save(Context context, Rating rating) {
        SharedPreferences prefs = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        prefs.edit().putFloat(RATE_PREFIX + rating.getId(), rating.getRate()).apply();
    }

    /**
     * Get rating on database by id
     * @param context Application context
     * @param id identifier to exhibition
     * @return Saved rating of exhibition or default
     */
    public static Rating getById(Context context, int id) {
        SharedPreferences prefs = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return new Rating(id, prefs.getFloat(RATE_PREFIX + id, 0.0f));
    }
}
