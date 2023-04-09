public class Book {
    private String bookName;
    private int pages;
    private int pageRead;
    private int pageRemain;

    public Book(String bookName, int pages){
        this.bookName=bookName;
        this.pages=pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageRead() {
        return pageRead;
    }

    public void setPageRead(int pageRead) {
        this.pageRead = pageRead;
    }

    public int getPageRemain() {
        return pageRemain;
    }

    public void setPageRemain(int pageRemain) {
        this.pageRemain = pageRemain;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int calculate(int pageRead){
        pageRemain = pages - pageRead;
        return pageRemain;
    }


}
