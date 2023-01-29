package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.ProductDao;
import com.token.authentication.project.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    public final ProductDao productDao;

}
