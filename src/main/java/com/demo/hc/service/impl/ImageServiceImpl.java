package com.demo.hc.service.impl;

import com.demo.hc.mapper.ImageinfoDAO;
import com.demo.hc.model.ImageInfoModel;
import com.demo.hc.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HC on 2018/10/17.
 */
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageinfoDAO imageinfoDAO;
    @Override
    public ImageInfoModel getImagById(String ImageId) {
        return imageinfoDAO.selectByPrimaryKey(ImageId);
    }
}
