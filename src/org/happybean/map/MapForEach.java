package org.happybean.map;

import org.happybean.common.Person;

import java.util.Map;

/**
 * @author wgt
 * @date 2018-09-12
 * @description map操作:Map类型不支持stream，不过Map提供了一些新的有用的方法来处理一些日常任务。
 * map forEach
 **/
public class MapForEach {

    public static void main(String[] args) {

        Map<Integer, Person> map = Person.getPersonMapData();
        forEach(map);
    }

    public static void forEach(Map<Integer, Person> map) {

        map.forEach((id, person) -> {
            System.out.println(id + ":" + person.toString());
        });
    }
}
