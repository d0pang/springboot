package com.yikesz.springboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class YikeszProperties {

    @Value("${com.yikesz.title}")
    private String title;
    @Value("${com.yikesz.description}")
    private String description;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
