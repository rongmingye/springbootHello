package com.example.helloworld.Helper;

import com.example.helloworld.common.utils.ObjectUtils;
import com.example.helloworld.entity.Info;
import com.example.helloworld.pojo.InfoVO;
import org.springframework.stereotype.Component;

@Component
public class InfoHelper {

    public InfoVO modelToVO(Info info) {
        InfoVO infoVO = new InfoVO();
        ObjectUtils.copyNotNullProperties(info, infoVO);
        infoVO.setType("text");
        return infoVO;
    }
}
