package org.example.principS.O.L.I.D.singleresponsiblity;

public class BookSingle {

    private String name;
    private String author;
    private String uuid;

    public BookSingle(String name, String author, String uuid) {
        this.name = name;
        this.author = author;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
