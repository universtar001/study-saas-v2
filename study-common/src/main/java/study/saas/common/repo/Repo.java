package study.saas.common.repo;

/**
 * @author Peter on 2017-04-07.
 */
public class Repo {


    public static String toCountJPql(String JPql) {

        if (JPql.contains("GROUP ")) {
            JPql = JPql.substring(0, JPql.indexOf("GROUP "));
        }

        if (JPql.contains("group ")) {
            JPql = JPql.substring(0, JPql.indexOf("group "));
        }

        return "SELECT COUNT(*) " + subFrom(JPql);
    }

    public static String subFrom(String JPql) {
        if (JPql.contains("FROM")) {
            return JPql.substring(JPql.indexOf("FROM"));
        }
        if (JPql.contains("from")) {
            return JPql.substring(JPql.indexOf("from"));
        }
        return JPql.substring(JPql.indexOf("FROM"));
    }


    public static String select(Class tClass, String fromSql) {
        return "SELECT new " + tClass.getName()
                + fromSql;
    }


}
