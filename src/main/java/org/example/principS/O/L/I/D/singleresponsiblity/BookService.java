package org.example.principS.O.L.I.D.singleresponsiblity;

public class BookService {

    private final BookSingle bookSingle;

    public BookService(BookSingle bookSingle) {
        this.bookSingle = bookSingle;
    }

    public void deleteByuuid(String uuid) {
        // logic

    }
}
