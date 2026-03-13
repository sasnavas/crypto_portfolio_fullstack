package com.portfolio.crypto_backend.repository;

import com.portfolio.crypto_backend.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {

}
