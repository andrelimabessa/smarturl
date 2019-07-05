package com.neueda.littleurl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neueda.littleurl.domain.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, String>{

}
