package br.com.dio;

import br.com.dio.model.cat;

public class FirstJavaProgram {
    public static void main(String[] args) {
        cat gato = new cat();
        System.out.println(gato);

        Book book1 = new Book("O problema dos 3 porcos", 300);
        System.out.println(book1);


        /*int a = 10;
        int b = 10;
        System.out.println("Hello World! " + (a + b));*/
    }
}

class Book {
    private String name;
    private Integer numPages;

    public Book(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
