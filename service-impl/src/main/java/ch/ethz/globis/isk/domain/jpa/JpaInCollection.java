package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.Book;
import ch.ethz.globis.isk.domain.InCollection;

public class JpaInCollection extends JpaPublication implements InCollection {

    private String note;
    private String pages;

    private Book parentPublication;

    public JpaInCollection() { }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public Book getParentPublication() {
        return parentPublication;
    }

    public void setParentPublication(Book book) {
        this.parentPublication = book;
    }
}