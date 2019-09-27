package com.example.helloworld.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.helloworld.entity.Info;

// 接口类

public interface InfoService extends IService<Info> {

    /**
     * 新增内容
     *
     * @param info
     * @param initInfo
     * @return
     */
    public Info addInfo(Info info, boolean initInfo);

}
