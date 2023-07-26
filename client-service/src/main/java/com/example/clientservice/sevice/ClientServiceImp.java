package com.example.clientservice.sevice;

import com.example.clientservice.feign.BookServiceClient;
import com.example.clientservice.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    private BookServiceClient bookServiceClient;

    public ClientServiceImp(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookServiceClient.getAllBooks();
    }
}