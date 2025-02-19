package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.GitHubEvent;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GitHubDao extends JpaRepository<GitHubEvent, Integer> {

    GitHubEvent findById(int id);

    List<GitHubEvent> findByOrderByDate();

}
