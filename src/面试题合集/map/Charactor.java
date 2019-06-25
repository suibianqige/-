package 面试题合集.map;

import java.util.Objects;

/**
 * @Author: 杨长江
 * @Date: 2019-06-24 22:37
 * @Description: 说明
 */
public class Charactor {

    private String name;

    private String solgan;

    public Charactor(String name, String solgan) {
        this.name = name;
        this.solgan = solgan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,solgan);
    }

    @Override
    public boolean equals(Object obj) {
        Charactor o = (Charactor) obj;
        return this.name.equals(o.name) && this.solgan.equals(o.solgan);
    }
}
