package study.saas.common.util;

import org.modelmapper.*;
import org.modelmapper.convention.MatchingStrategies;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author even
 * @Title: CopyClassUtil
 * @Description: TODO
 * @date 2019-08-02
 */
public class CopyClassUtil {
    /**
     * 单个实体之间的转换
     * @param obj
     * @param result
     * @param <T>
     * @return
     */
    public static <T> T copyClass(Object obj, Class<T> result) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setFieldMatchingEnabled(true);
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        T dto = modelMapper.map(obj, result);
        return dto;
    }

    /**
     * 实体列表之间的转换
     * @param obj
     * @param result
     * @param <T>
     * @param <S>
     * @return
     */
    public static <T, S> List<T> copyClassList(List<S> obj, Class<T> result) {
        List<T> list = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setFieldMatchingEnabled(true);
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        for (S s : obj) {
            T dto = modelMapper.map(s, result);
            list.add(dto);
        }
        return list;
    }

    /**
     * 实体列表转换
     * @param sources
     * @param type = new TypeToken<List<T>>(){}.getType()
     * @param <S>
     * @param <T>
     * @return
     */
    public static <S, T> List<T> copyList(List<S> sources,Type type) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setFieldMatchingEnabled(true);
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        List<T> list = modelMapper.map(sources, type);
        return list;
    }

    /**
     * 实体转换
     * @param source
     * @param target
     * @param <S>
     * @param <T>
     */
    public static <S, T> void copyClass(S source,T target) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setFieldMatchingEnabled(true);
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        modelMapper.map(source, target);
    }

}
