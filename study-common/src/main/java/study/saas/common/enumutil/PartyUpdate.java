package study.saas.common.enumutil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Even
 * @Description:党建更新进度类型
 * @Date Created in 16:35 2018/4/20
 */
public enum PartyUpdate {
    /**
     * 备案表归档
     */
    ACTIVIST_RECORD,
    /**
     * 完成备案
     */
    DEVELOPMENT_RECORD,

    /**
     *导出pdf备案表
     */
    EXPORT_RECORD;

    private static final Map<Integer, PartyUpdate> INT_TO_TYPE_MAP = new HashMap<>();

    static {
        for (PartyUpdate type : PartyUpdate.values()) {
            INT_TO_TYPE_MAP.put(type.ordinal(), type);
        }
    }

    public static PartyUpdate of(int x) {
        return INT_TO_TYPE_MAP.get(x);
    }
}
