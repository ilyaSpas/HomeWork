package com.example.web_shop.repo;

import com.example.web_shop.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository <Image, Long> {
}
