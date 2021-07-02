package com.yuetsao.business_algo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KVDTest {
    private static final Integer THRESHOLD_SHOW_NUM = 3;

    @Data
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class KVD {
        private String point;
        private String value;
        private String time;
    }

    public static void main(String[] args) {
        List<KVD> kvds = new ArrayList<>();
        KVD kvd1 = new KVD("1", "v1", "2021-07-02 00:00:01");
        KVD kvd2 = new KVD("1", "v1", "2021-07-02 00:00:02");
//        KVD kvd3 = new KVD("2", "v1", "2021-07-02 00:00:03");
        KVD kvd4 = new KVD("3", "v1", "2021-07-02 00:00:04");
        KVD kvd5 = new KVD("3", "v1", "2021-07-02 00:00:05");
        kvds.add(kvd1);
        kvds.add(kvd2);
//        kvds.add(kvd3);
        kvds.add(kvd4);
        kvds.add(kvd5);


        if(!CollectionUtils.isEmpty(kvds) && kvds.size()>THRESHOLD_SHOW_NUM) {
            List<KVD> resultList = new ArrayList<>();
            Map<String, List<KVD>> kvdListMap = kvds.stream().collect(Collectors.groupingBy(KVD::getPoint));
            if(kvdListMap.size() >= THRESHOLD_SHOW_NUM) {
                Map<String, String> pointMap = new HashMap<>();
                kvds.forEach( e -> {
                    if(!pointMap.containsKey(e.getPoint()) && resultList.size() < THRESHOLD_SHOW_NUM) {
                        resultList.add(e);
                        pointMap.put(e.getPoint(), e.getPoint());
                    }
                });
            }else {
                int diffNum = THRESHOLD_SHOW_NUM - kvdListMap.size();
                int initNum = 0;
                Map<String, String> pointMap = new HashMap<>();
                for(KVD kvd: kvds) {
                    Boolean isAdd = (!pointMap.containsKey(kvd.getPoint()) || initNum < diffNum) && resultList.size() < THRESHOLD_SHOW_NUM;
                    if(isAdd) {
                        resultList.add(kvd);
                        if(pointMap.containsKey(kvd.getPoint())) {
                            initNum = initNum + 1;
                        }
                        pointMap.put(kvd.getPoint(), kvd.getPoint());
                    }
                }
            }
            System.out.println(resultList);
        }
    }
}
