package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.PurchaseOrderDao;
import com.token.authentication.project.service.PurchaseOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    public final PurchaseOrderDao purchaseOrderDao;
}
