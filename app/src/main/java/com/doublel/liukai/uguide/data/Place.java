package com.doublel.liukai.uguide.data;

public class Place {

    public String name;
    public Category[] categories;

    public static class Category {
        public String name;
        public Item[] items;

        public static class Item {
            public String name;
            public String picture;
            public String thumbnail;
        }
    }
}

