package com.portfolio.crypto_backend.controller;

import com.portfolio.crypto_backend.model.Asset;
import com.portfolio.crypto_backend.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
@CrossOrigin(origins = "http://localhost:4200")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @PostMapping
    public Asset add(@RequestBody Asset asset) {
        return assetService.saveAsset(asset);
    }

    @GetMapping
    public List<Asset> getAllAssets() {
        return assetService.getAllAssets();
    }

    @DeleteMapping("/{id}")
    public void deleteAsset(@PathVariable Long id) {
        assetService.deleteAsset(id);
    }
}
