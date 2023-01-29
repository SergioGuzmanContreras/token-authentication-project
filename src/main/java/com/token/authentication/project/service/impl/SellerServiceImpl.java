package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.SellerDao;
import com.token.authentication.project.service.SellerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SellerServiceImpl implements SellerService {

    public final SellerDao sellerDao;

}
