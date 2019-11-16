package com.melvinsalas.museumrate.repositories;

import com.melvinsalas.museumrate.models.Exhibition;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionsRepository {
    public static List<Exhibition> getAll() {
        List<Exhibition> list = new ArrayList<>();

        list.add(new Exhibition(1, "Lorem ipsum dolor sit amet", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.31.jpeg", "Nam laoreet ultrices arcu efficitur condimentum. Vestibulum scelerisque nunc ante, et placerat lorem interdum sit amet. Vestibulum elementum ornare laoreet. Aliquam malesuada pretium nibh eget consequat. Vivamus ut massa neque. Integer quis laoreet metus. Vestibulum", "Vivamus", 2001));
        list.add(new Exhibition(2, "Nam laoreet ultrices", "https://museumrate.s3.amazonaws.com/photo_2019-11-16 17.30.32.jpeg", "Morbi cursus vehicula pellentesque. Duis nec dignissim felis, in sodales felis.", "Nibh ut Finibus", 2001));
        list.add(new Exhibition(4, "Mauris blandit magna", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.34.jpeg", "Donec quis mi vel eros consectetur mollis. Sed vitae magna quis eros volutpat tincidunt eget et massa. Phasellus felis ex, posuere vel semper sit amet, tincidunt ut leo. Nulla justo arcu, porttitor a tempor vel, ornare vel ipsum. Duis ullamcorper sagittis tellus ac dapibus.", "Nibh ut Finibus", 2001));
        list.add(new Exhibition(5, "Pellentesque habitant morbi", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.35.jpeg", "Vestibulum vel dolor tempor, pellentesque enim eu, convallis ex. Nullam purus nibh, congue eu nisi ut, finibus facilisis neque. Maecenas sit amet scelerisque nulla, ut aliquet est.", "Vivamus", 2001));
        list.add(new Exhibition(6, "Quisque at sapien", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.36.jpeg", "Nullam molestie pretium justo, a auctor nunc ultrices et. Nam ultrices quis lectus vel interdum. Proin eu sapien tristique, posuere elit nec, hendrerit massa. Proin placerat risus ante, at molestie nisi tempus id. Integer ante justo, maximus et neque id, vestibulum varius ipsum.", "Nibh ut Finibus", 2001));
        list.add(new Exhibition(7, "Ut consequat elit", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.37.jpeg", "Proin placerat risus ante, at molestie nisi tempus id. Integer ante justo, maximus et neque id, vestibulum varius ipsum.", "Vivamus", 2001));
        list.add(new Exhibition(8, "Quisque consectetur", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.38.jpeg", "Nam ipsum nisl, pulvinar et elit ac, elementum tincidunt turpis. Praesent semper bibendum magna at maximus. Ut vitae tincidunt lectus. Praesent vitae purus vestibulum, congue metus nec, commodo ipsum. Sed scelerisque eros eu augue vulputate interdum.", "Vivamus", 2001));
        list.add(new Exhibition(9, "Maecenas eleifend", "https://museumrate.s3.amazonaws.com/photo_2019-11-16+17.30.45.jpeg", "Praesent semper mattis est, eget sodales sapien ullamcorper sed. Vestibulum suscipit mauris nunc, ut ornare ligula pretium nec. ", "Maecenas", 2001));

        return list;
    }
}
