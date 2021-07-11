package com.example.mynews;

public class Articles {
    private String tittle;
    private String description;
    private String urlToImage;
    private String url;
    private String content;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Articles(String tittle, String description, String urlToImage, String url, String content) {
        this.tittle = tittle;
        this.description = description;
        this.urlToImage = urlToImage;
        this.url = url;
        this.content = content;
    }
}
