package com.example.WebApplication.Repositories;

import com.example.WebApplication.Models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
