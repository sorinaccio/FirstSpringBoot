package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amzas on 24/10/2016.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {


}
