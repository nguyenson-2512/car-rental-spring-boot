package com.example.project.repository;

import com.example.project.entity.CarEntity;
import com.example.project.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Create by Tuan
 * 11:48
 * 16 Jan 2022
 */
public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
    void deleteImageEntitiesByDescription(String description);
    List<ImageEntity> findAllByCarOfImage(CarEntity carOfImage);
}
