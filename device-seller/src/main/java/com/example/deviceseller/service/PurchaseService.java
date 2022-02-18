package com.example.deviceseller.service;

import com.example.deviceseller.model.Purchase;
import com.example.deviceseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
