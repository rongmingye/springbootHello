package com.example.helloworld.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

public class ObjectUtils {
    /**
     * 获取值为空的属性名
     *
     * @param object
     * @return
     */
    public static String[] getNullPropertyNames(Object object) {
        final BeanWrapper src = new BeanWrapperImpl(object);
        PropertyDescriptor[] propertyDescriptors = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for (PropertyDescriptor pd : propertyDescriptors) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    /**
     * 复制Object(过滤掉值为空的属性, 两个object属性同名的才会复制过去)
     *
     * @param source 源对象
     * @param target 目标对象
     * @return
     */
    public static void copyNotNullProperties(Object source, Object target) {
        if (source != null) {
            BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
        }
    }

}
