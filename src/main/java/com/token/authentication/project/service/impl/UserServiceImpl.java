package com.token.authentication.project.service.impl;

import com.token.authentication.project.dao.UserDao;
import com.token.authentication.project.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    public final UserDao userDao;

}
