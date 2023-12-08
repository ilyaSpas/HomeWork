package com.ilsy.http.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JspHelper {
    public static final String PATH_TO_FSP = "/WEB-INF/jsp/";
    public static String getPath(String jspName){
        return PATH_TO_FSP + jspName;
    }
}
