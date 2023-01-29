package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.InventoryDao;
import com.token.authentication.project.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    public final InventoryDao inventoryDao;
}
