package com.duhe.maple.pic.rest;

import com.duhe.common.dto.ResponseCommonDTO;
import com.duhe.common.util.ResponseCommonDTOUtil;
import com.duhe.maple.dto.request.Request1001DTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 语音转换rest接口定义
 */
@RestController
@RequestMapping(value = "/api/pic")
public class PicRest {

    @RequestMapping(value = "/1001/v1", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseCommonDTO<String> uploadFile(@RequestBody Request1001DTO request) throws Exception {
        return ResponseCommonDTOUtil.success();
    }


}
