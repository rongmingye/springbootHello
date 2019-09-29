package com.example.helloworld.controller;


import com.example.helloworld.common.api.ApiBaseResultCode;
import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.entity.Info;
import com.example.helloworld.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @PostMapping("add")
    public ApiResponse<Info> add(Info info) {
        if (info == null || StringUtils.isEmpty(info.getName())) {
            return ApiResponse.failure(ApiBaseResultCode.PARAMSFAILED.code(), "缺少参数：name");
        }

        Info newInfo = infoService.addInfo(info, true);
        if (newInfo == null) {
            return ApiResponse.failure(ApiBaseResultCode.FAILURE.code(), "系统出错，创建失败，请联系系统管理员");
        } else {
            ApiResponse response = ApiResponse.success("内容创建成功");
            response.setData("");
            return response;
        }
    }
}
