package study.saas.common.enumutil;

import java.util.HashMap;
import java.util.Map;

public enum CacheRedisEnum {
    menuPermission,//菜单权限 0
//    roleOfMenuPermission,//权限与菜单的权限
//    sysPermission,//人员权限

    allAdminRole,//查询某个租户下全部角色 1

//    adminRole,//查询用户对应的角色

    findAllMenu,//查询所有菜单  2
//    findAllMenuByProductId,
//    findAllMenuByMenuKeyId,
//    findAllMenuByPageModel,
    checkProductOverDue,//将检查产品是否过期的结果放入缓存 3

    updateMenuPermission //更新菜单权限 4
    ;




    private static final Map<Integer,CacheRedisEnum> intToTypeMap = new HashMap<>();

    static {

        for (CacheRedisEnum type : CacheRedisEnum.values()){
            intToTypeMap.put(type.ordinal(),type);
        }
    }

    public static CacheRedisEnum of(int x){
        return intToTypeMap.get(x);
    }
}
