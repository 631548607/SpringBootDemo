package com.demo.hc.mapper;

import com.demo.hc.model.ImageInfoModel;
import org.springframework.stereotype.Repository;

/**
 * ImageinfoDAO继承基类
 */
@Repository
public interface ImageinfoDAO extends MyBatisBaseDao<ImageInfoModel, String> {
}