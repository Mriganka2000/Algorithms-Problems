package com.example.deviceseller.service;

import com.example.deviceseller.model.Purchase;
import com.example.deviceseller.repository.PurchaseRepository;
import com.example.deviceseller.repository.projection.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());

        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemsOfUser(Long userId) {
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }

}
