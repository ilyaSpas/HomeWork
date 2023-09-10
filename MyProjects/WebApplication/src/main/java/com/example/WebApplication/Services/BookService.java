package com.example.WebApplication.Services;

import com.example.WebApplication.Models.Book;
import com.example.WebApplication.Models.Image;
import com.example.WebApplication.Repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOError;
import java.io.IOException;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void save(Book book, MultipartFile file1) throws IOException {
        Image image1;
        if (file1.getSize() != 0){
            image1 = toImageEntity(file1);
            book.addImageToProduct(image1);
        }
        bookRepository.save(book);
    }

    private Image toImageEntity(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize(file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }


}
