package com.demo.hc.service;

import com.demo.hc.model.ImageInfoModel;
import org.springframework.stereotype.Service;

/**
 * Created by HC on 2018/10/17.
 */
public interface ImageService {
    ImageInfoModel getImagById(String ImageId);
}
