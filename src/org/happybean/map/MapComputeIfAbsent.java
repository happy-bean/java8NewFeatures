package org.happybean.map;

import org.happybean.common.Person;

import java.util.Map;

/**
 * @author wgt
 * @date 2018-09-12
 * @description computeIfAbsent:computeIfAbsent和compute的关系,就类似于putIfAbsent和put的关系：
 * computeIfAbsent在key不在Map中或者与key相关联的value为null时，才执行通过函数计算新value的操作，
 * 否则不执行；computeIfAbsent的返回值也是与key相关联的最新的value。
 **/
public class MapComputeIfAbsent {

    public static void main(String[] args) {

        Map<Integer, Person> map = Person.getPersonMapData();

        computeIfAbsent(4, map);
        MapForEach.forEach(map);
    }

    public static void computeIfAbsent(int id, Map<Integer, Person> map) {

        map.computeIfAbsent(id, (k) -> new Person("happy new year", 2018));
        map.computeIfAbsent(id + 1, (k) -> new Person("happy new year", 2018));
    }
}
