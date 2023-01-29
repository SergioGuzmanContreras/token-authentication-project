package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.VendorDao;
import com.token.authentication.project.service.VendorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService {

    public final VendorDao vendorDao;
}
