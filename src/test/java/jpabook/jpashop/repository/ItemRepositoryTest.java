package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    EntityManager em;

    @Test
    void updateTest() {
        Book book = em.find(Book.class, 1L);

        book.setName("adfadf");
    }

}