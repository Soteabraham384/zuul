package com.netflix.zuul.discovery;

import com.netflix.loadbalancer.Server.MetaInfo;

/**
 * @author Argha C
 * @since 2/25/21
 *
 * placeholder to mimic metainfo for a non-Eureka enabled server.
 * This exists to preserve compatibility with some current logic, but should be revisited.
 */
public class SimpleMetaInfo {

    private final MetaInfo metaInfo;

    public SimpleMetaInfo(MetaInfo metaInfo) {
        this.metaInfo = metaInfo;
    }

    public String getServerGroup() {
        return metaInfo.getServerGroup();
    }

    public String getServiceIdForDiscovery() {
        return metaInfo.getServiceIdForDiscovery();
    }

    public String getInstanceId() {
        return metaInfo.getInstanceId();
    }
}
