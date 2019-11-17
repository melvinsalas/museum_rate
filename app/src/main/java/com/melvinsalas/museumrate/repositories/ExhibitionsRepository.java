package com.melvinsalas.museumrate.repositories;

import com.melvinsalas.museumrate.models.Exhibition;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionsRepository {

    // Simulate a database
    private static final List<Exhibition> exhibitions = new ArrayList<Exhibition>() {{
        add(new Exhibition(3487, "Ut consequat elit", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.36.jpeg", "Proin placerat risus ante, at molestie nisi tempus id. Integer ante justo, maximus et neque id, vestibulum varius ipsum.", "Vivamus", 2011));
        add(new Exhibition(3864, "Quisque at sapien", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.35.jpeg", "Nullam molestie pretium justo, a auctor nunc ultrices et. Nam ultrices quis lectus vel interdum. Proin eu sapien tristique, posuere elit nec, hendrerit massa. Proin placerat risus ante, at molestie nisi tempus id. Integer ante justo, maximus et neque id, vestibulum varius ipsum.", "Nibh ut Finibus", 2001));
        add(new Exhibition(3876, "Curabitur scelerisque", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+18.00.08.jpeg", "Maecenas egestas metus nec leo posuere sagittis. Curabitur scelerisque sagittis lacus. Donec elementum ipsum vel laoreet interdum. Ut rhoncus tempor orci sed laoreet.", "Maecenas", 2001));
        add(new Exhibition(4456, "Nam laoreet ultrices", "https://museumrate.s3.amazonaws.com/photo_2019-11-16 17.30.32.jpeg", "Morbi cursus vehicula pellentesque. Duis nec dignissim felis, in sodales felis.", "Nibh ut Finibus", 2019));
        add(new Exhibition(4585, "Maecenas eleifend", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.38.jpeg", "Praesent semper mattis est, eget sodales sapien ullamcorper sed. Vestibulum suscipit mauris nunc, ut ornare ligula pretium nec. ", "Maecenas", 1892));
        add(new Exhibition(4875, "Pellentesque habitant morbi", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.34.jpeg", "Vestibulum vel dolor tempor, pellentesque enim eu, convallis ex. Nullam purus nibh, congue eu nisi ut, finibus facilisis neque. Maecenas sit amet scelerisque nulla, ut aliquet est.", "Vivamus", 1982));
        add(new Exhibition(8763, "Lorem ipsum dolor sit amet", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.31.jpeg", "Nam laoreet ultrices arcu efficitur condimentum. Vestibulum scelerisque nunc ante, et placerat lorem interdum sit amet. Vestibulum elementum ornare laoreet. Aliquam malesuada pretium nibh eget consequat. Vivamus ut massa neque. Integer quis laoreet metus. Vestibulum", "Vivamus", 2019));
        add(new Exhibition(9734, "Mauris blandit magna", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.33.jpeg", "Donec quis mi vel eros consectetur mollis. Sed vitae magna quis eros volutpat tincidunt eget et massa. Phasellus felis ex, posuere vel semper sit amet, tincidunt ut leo. Nulla justo arcu, porttitor a tempor vel, ornare vel ipsum. Duis ullamcorper sagittis tellus ac dapibus.", "Nibh ut Finibus", 2009));
        add(new Exhibition(9863, "Quisque consectetur", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.37.jpeg", "Nam ipsum nisl, pulvinar et elit ac, elementum tincidunt turpis. Praesent semper bibendum magna at maximus. Ut vitae tincidunt lectus. Praesent vitae purus vestibulum, congue metus nec, commodo ipsum. Sed scelerisque eros eu augue vulputate interdum.", "Vivamus", 1990));
    }};

    /**
     * Get all exhibition elements on repository
     * @return All exhibitions on database
     */
    public static List<Exhibition> getAll() {
        return exhibitions;
    }

    /**
     * Get a exhibition element by id
     * @param id identifier number of exhibition
     * @return The exhibition with the number
     */
    public static Exhibition getById(int id) {
        // We cannot use Stream because we are not using Java 8
        for (Exhibition exhibition : exhibitions) {
            if (exhibition.getId() == id) {
                return exhibition;
            }
        }
        return null;
    }
}
