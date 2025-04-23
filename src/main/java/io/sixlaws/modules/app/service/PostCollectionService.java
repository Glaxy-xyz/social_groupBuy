/**
 * -----------------------------------
 * 林风社交论坛开源版本请务必保留此注释头信息
 * 开源地址: https://gitee.com/virus010101/linfeng-community
 * 可正常分享和学习源码，不得用于非法牟利！
 * 商业版购买联系技术客服 QQ: 3582996245
 * Copyright (c) 2021-2025 linfeng all rights reserved.
 * 演示站点:https://www.linfengtech.cn
 * 版权所有，侵权必究！
 * -----------------------------------
 */
package io.sixlaws.modules.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sixlaws.common.utils.PageUtils;
import io.sixlaws.modules.admin.entity.AppUserEntity;
import io.sixlaws.modules.app.entity.PostCollectionEntity;
import io.sixlaws.modules.app.param.AddCollectionForm;

import java.util.List;
import java.util.Map;


public interface PostCollectionService extends IService<PostCollectionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    Integer collectCount(Integer postId);

    Boolean isCollection(Integer uid,Integer postId);

    void cancelCollection(AddCollectionForm request, AppUserEntity user);

    List<Integer> getPostListByUid(Integer uid);
}

