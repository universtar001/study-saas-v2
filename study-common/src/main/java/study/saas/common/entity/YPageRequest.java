package study.saas.common.entity;

import org.springframework.data.domain.PageRequest;

public class YPageRequest extends PageRequest implements YPageable {


    private String countSql;
    

    public YPageRequest(int page, int size) {
        super(page, size);
    }

    @Override
    public String getCountSql() {
        return countSql;
    }

    @Override
    public String setCountSql(String countSql) {
        return this.countSql = countSql;
    }


}
