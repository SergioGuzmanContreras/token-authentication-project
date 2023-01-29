package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.ProductPriceDao;
import com.token.authentication.project.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductPriceServiceImpl implements ProductPriceService {

    public final ProductPriceDao productPriceDao;

}
