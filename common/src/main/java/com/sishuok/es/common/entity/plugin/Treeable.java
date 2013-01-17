/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.common.entity.plugin;

/**
 * <p>实体实现该接口表示想要实现树结构
 * <p> path表示路径信息，长度为<code>getPathLength</code>方法返回的长度，假如长度为2结构如下
 * <pre>
 *      01      中国
 *      0101    北京
 *      010102  海淀
 * </pre>
 * <p/>
 * <p>User: Zhang Kaitao
 * <p>Date: 13-1-12 下午4:18
 * <p>Version: 1.0
 */
public interface Treeable {

    public void setTitle(String title);

    public String getTitle();

    public int getPath();

    public void setPath(int path);

    /**
     * 每级路径的长度
     *
     * @return
     */
    public int getPathLength();
}