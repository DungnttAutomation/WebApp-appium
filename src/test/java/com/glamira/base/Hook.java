package com.glamira.base;

import com.glamira.config.AppiumConfig;
import com.glamira.config.MobilePlatform;


public class Hook {

    private final AppiumConfig config = AppiumConfig.getInstanceFor(MobilePlatform.IOS);

}
