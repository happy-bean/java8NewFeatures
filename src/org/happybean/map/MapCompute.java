package org.happybean.map;

import org.happybean.common.Person;

import java.util.Map;

/**
 * @author wgt
 * @date 2018-09-12
 * @description compute:compute方法和原来put方法的区别在于：
 * put(K key,V value)方法，如果key在Map中不存在，那么直接加入；如果已经存在，那么使用新的value替换旧的value；
 * 而compute(K key,BiFunction remappingFunction)方法可以通过一个BiFunction来计算出新的value，BiFunction的参数为旧的key和value，
 * 返回计算出新的value——与put方法不同，compute方法返回的会是最新的与key相关联的value，而不是旧的value
 **/
public class MapCompute {

    public static void main(String[] args) {

        Map<Integer, Person> map = Person.getPersonMapData();

        compute(4, map);
        MapForEach.forEach(map);
    }

    public static void compute(int id, Map<Integer, Person> map) {

        map.compute(id, (k, v) -> k == 4 ? new Person(v.getName(), 2018) : v);
    }
}
