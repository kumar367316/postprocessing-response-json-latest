package com.custom.postprocessing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom.postprocessing.entity.PostProcessingJsonEntity;
import com.custom.postprocessing.scheduler.PostProcessingScheduler;

/**
 * @author kumar.charanswain
 *
 */
@RequestMapping("postprocessing")
@RestController
public class PostProcessingController {

	public static final Logger logger = LoggerFactory.getLogger(PostProcessingController.class);
	
    @Autowired
    private PostProcessingScheduler postProcessingScheduler;

    @GetMapping("formoperation")
    public PostProcessingJsonEntity manualPostProcessBatch() {

    	PostProcessingJsonEntity postProcessingJsonEntity = postProcessingScheduler.smartCommPostProcessing();
    	return postProcessingJsonEntity;
    }
}
