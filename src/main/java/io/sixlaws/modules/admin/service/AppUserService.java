/**
 * -----------------------------------
 * 林风社交论坛开源版本请务必保留此注释头信息
 * 开源地址: https://gitee.com/virus010101/linfeng-community
 * 商业版详情查看: https://www.linfengtech.cn
 * 商业版购买联系技术客服
 * QQ:  3582996245
 * 可正常分享和学习源码，不得转卖或非法牟利！
 * Copyright (c) 2021-2025 linfeng all rights reserved.
 * 版权所有 ，侵权必究！
 * -----------------------------------
 */
package io.sixlaws.modules.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sixlaws.common.vo.AppUserInfoResponse;
import io.sixlaws.common.vo.AppUserRankResponse;
import io.sixlaws.common.vo.AppUserResponse;
import io.sixlaws.common.vo.HomeRateResponse;
import io.sixlaws.common.utils.AppPageUtils;
import io.sixlaws.common.utils.PageUtils;
import io.sixlaws.modules.admin.entity.AppUserEntity;
import io.sixlaws.modules.app.param.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author linfeng
 * @email 3582996245@qq.com
 * @date 2022-01-20 12:10:43
 */
public interface AppUserService extends IService<AppUserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void ban(Integer id);

    void openBan(Integer id);

    /**
     * 首页数据
     * @return HomeRateResponse
     */
    HomeRateResponse indexDate();

    Integer smsLogin(SmsLoginForm form, HttpServletRequest request);

    String sendSmsCode(SendCodeForm param);

    AppUserResponse getUserInfo(AppUserEntity user);

    void updateAppUserInfo(AppUserUpdateForm appUserUpdateForm, AppUserEntity user);

    void addFollow(AddFollowForm request, AppUserEntity user);

    void cancelFollow(AddFollowForm request, AppUserEntity user);

    AppPageUtils userFans(Integer page, Integer uid);

    AppPageUtils follow(Integer page, AppUserEntity user);

    AppUserInfoResponse findUserInfoById(Integer uid, AppUserEntity user);

    Integer miniWxLogin(WxLoginForm form);

    List<AppUserRankResponse> userRank();

    List<AppUserEntity> getBatchUser(List<Integer> uidList);
}

