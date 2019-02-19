package com.yuhaowin.design.structure.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDateSource extends AbstractRoutingDataSource {

    /**
     * 返回值表明当前线程是哪个db
     *
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}

