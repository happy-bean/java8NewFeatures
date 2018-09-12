package org.happybean.map;

import org.happybean.common.Person;

import java.util.Map;

/**
 * @author wgt
 * @date 2018-09-12
 * @description putIfAbsent:如果当前Map不存在键key或者该key关联的值为null那么就执行put(key,value)；否则便不执行put操作。
 **/
public class MapPut {

    public static void main(String[] args) {

        Map<Integer, Person> map = Person.getPersonMapData();

        put(4, new Person("e", 21), map);
        MapForEach.forEach(map);

        System.out.println();

        putIfAbsent(4, new Person("f", 21), map);
        MapForEach.forEach(map);
    }

    public static void put(int id, Person person, Map<Integer, Person> map) {

        map.put(id, person);
    }

    public static void putIfAbsent(int id, Person person, Map<Integer, Person> map) {

        map.putIfAbsent(id, person);
    }
}
