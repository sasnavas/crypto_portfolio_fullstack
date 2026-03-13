package com.portfolio.crypto_backend.service;

import com.portfolio.crypto_backend.model.Asset;
import com.portfolio.crypto_backend.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;

    public Asset saveAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public Asset getAssetById(Long id) {
        return assetRepository.findById(id).orElse(null);
    }

    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }
}
