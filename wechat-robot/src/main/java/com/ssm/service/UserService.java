package com.ssm.service;

import com.alibaba.fastjson.JSONArray;
import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author szg
 * @create 2017-12-07 15:45
 **/
@Service
public class UserService {
    Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserMapper userMapper;

    public ModelAndView queryUserList(User user){

        logger.info("=========进入首页==========");
        ModelAndView modelAndView = new ModelAndView();
        logger.info("=======查列表==========");
        List<User> userList = userMapper.queryUserList(user);

        logger.info("=======查一个==========");
        user = userMapper.getUser(1);

        logger.info("=======更新一个==========");
        userMapper.updateUser(user);

        logger.info("=======加一个==========");
        user.setId(2);
        userMapper.insertUser(user);

        logger.info("=======删一个==========");
        userMapper.delectUser(2);

        modelAndView.addObject(userList);
        modelAndView.setViewName("user/userList");
        System.out.println(JSONArray.toJSONString(modelAndView));
        return modelAndView;
    }

}
