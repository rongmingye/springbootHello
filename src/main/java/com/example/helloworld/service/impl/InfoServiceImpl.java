package com.example.helloworld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.helloworld.entity.Info;
import com.example.helloworld.mapper.InfoMapper;
import com.example.helloworld.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 实现类

@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public Info addInfo(Info info, boolean initInfo) {
        if (info == null || info.getName() == null) {
            return null;
        }

        infoMapper.insert(info);

        return info;
    }
}
