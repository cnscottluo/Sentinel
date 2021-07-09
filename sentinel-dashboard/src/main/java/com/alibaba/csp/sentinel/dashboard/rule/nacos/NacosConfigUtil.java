package com.alibaba.csp.sentinel.dashboard.rule.nacos;

public class NacosConfigUtil {
    public static final String GROUP_ID = "SENTINEL_GROUP";

    public static final String FLOW_DATA_ID_POSTFIX = "-flow-rules.json";
    public static final String DEGRADE_DATA_ID_POSTFIX = "-degrade-rules.json";
    public static final String PARAM_FLOW_DATA_ID_POSTFIX = "-param-rules.json";
    public static final String SYS_DATA_ID_POSTFIX = "-system-rules.json";
    public static final String AUTH_DATA_ID_POSTFIX = "-auth-rules.json";
    public static final String GATEWAY_FLOW_DATA_ID_POSTFIX = "-gateway-flow.json";
    public static final String GATEWAY_API_DATA_ID_POSTFIX = "-gateway-api.json";

    public static final String CLUSTER_MAP_DATA_ID_POSTFIX = "-cluster-map.json";

    /**
     * cc for `cluster-client`
     */
    public static final String CLIENT_CONFIG_DATA_ID_POSTFIX = "-cc-config";
    /**
     * cs for `cluster-server`
     */
    public static final String SERVER_TRANSPORT_CONFIG_DATA_ID_POSTFIX = "-cs-transport-config";
    public static final String SERVER_FLOW_CONFIG_DATA_ID_POSTFIX = "-cs-flow-config";
    public static final String SERVER_NAMESPACE_SET_DATA_ID_POSTFIX = "-cs-namespace-set";

    private NacosConfigUtil() {
    }
}
