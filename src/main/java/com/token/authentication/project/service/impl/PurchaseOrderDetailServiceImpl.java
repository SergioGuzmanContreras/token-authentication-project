package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.PurchaseOrderDetailDao;
import com.token.authentication.project.service.PurchaseOrderDetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PurchaseOrderDetailServiceImpl implements PurchaseOrderDetailService {

    public final PurchaseOrderDetailDao purchaseOrderDetailDao;

}
