package com.example.motty.apiproject.model;

/**
 * Created by motty on 2017/09/27.
 */

public class shop {
    private int id;
    private String name;
    private float latitude;
    private float longitude;
    private String created_at;
    private String updated_at;
    private String url;



    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public String getCreated_at(){
        return created_at;
    }

    public String getUpdated_at(){
        return updated_at;
    }

    public String getUrl(){
        return url;
    }


    @Override
    public String toString() {
        return "shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

