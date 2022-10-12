package study.saas.common.entity;

import org.springframework.data.domain.Pageable;

public interface YPageable extends Pageable {

    String getCountSql();

    String setCountSql(String countSql);


}
