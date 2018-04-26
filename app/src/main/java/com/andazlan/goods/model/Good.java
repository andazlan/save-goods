package com.andazlan.goods.model;

public class Good {
    private String id, name, description, category;
    private int stock;
    private long timestamp;

    public Good() {
        this.timestamp = System.currentTimeMillis()/1000;
    }

    public Good(String id, String name, String description, String category, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.stock = stock;
        this.timestamp = System.currentTimeMillis()/1000;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
