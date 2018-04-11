package xin.scoutzhang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.scoutzhang.constant.Code;
import xin.scoutzhang.domain.User;
import xin.scoutzhang.dto.Response;
import xin.scoutzhang.service.IUserService;
import xin.scoutzhang.util.ResponseUtil;

/**
 * Created by DEAN on 2018/4/10.
 */
@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/user/signUp", method = RequestMethod.POST)
    public Response signUp(@RequestBody User user){
        if(user.getUsername()==null||user.getPassword()==null||user.getPhone()==null||
                user.getUserType()==null){
            //用户必填信息由前端判定，但前端判定失败，导致不完整的用户信息传入到后台
            return ResponseUtil.codeResponse(Code.UNDEFINED);
        }else if(!user.getUserType().equals("person")&&!user.getUserType().equals("company")){
            //用户类型由前端选项：person（个人用户）或者company（企业用户）控制
            //前端提供选项参数失败，导致错误信息传入后台
            return ResponseUtil.codeResponse(Code.UNDEFINED);
        }else{
            int res = userService.setUser(user);
            if(res == 1){
                return ResponseUtil.successResponse(user);
            }else if(res == -2){
                return ResponseUtil.codeResponse(Code.UNDEFINED);
            }else if(res == -1){
                return ResponseUtil.codeResponse(Code.ACCOUNT_ALREADY_EXIST);
            }else{
                return ResponseUtil.failResponse(user);
            }
        }
    }
}
