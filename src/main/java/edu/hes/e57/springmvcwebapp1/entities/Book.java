package edu.hes.e57.springmvcwebapp1.entities;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CATEGORY_NAME")
    private String category_name;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "PUBLISHER")
    private String publisher;

    @Column(name = "PRICE")
    private Integer price;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getCategoryName() { return category_name; }
    public void setCategoryName(String category_name) { this.category_name = category_name; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Integer getPrice() {return price; }
    public void setPrice(Integer price) { this.price = price; }



}
