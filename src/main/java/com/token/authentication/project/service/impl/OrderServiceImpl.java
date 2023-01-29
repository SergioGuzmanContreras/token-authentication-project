package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.OrderDao;
import com.token.authentication.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    public final OrderDao orderDao;
}
