package com.lokendrasingh.retrofit;

import com.google.gson.annotations.SerializedName;

public class RetroPhoto {
    @SerializedName("albumId")
    private Integer albumId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    private RetroPhoto(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }
}
