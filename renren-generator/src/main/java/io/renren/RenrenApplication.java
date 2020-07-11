package io.renren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@MapperScan("io.renren.dao")
public class RenrenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenrenApplication.class, args);
		int[] ss =new int[7];
		ss[0] = 0;
		ss[1] = 1;
		ss[2] = 5;
		ss[3] = 3;
		ss[4] = 3;
		ss[5] = 5;
		ss[6] = 6;
		HashSet hashSet = new HashSet();
		//存放重复数据
		List<Integer> list = new ArrayList<>();
		//存放ss中不重复只出现一次的数据
		List<Integer> list1 = new ArrayList<>();
		Arrays.stream(ss).forEach(i -> {
			if(!hashSet.add(i)) {
				list.add(i);
			}
		});

		Arrays.stream(ss).forEach(i -> {
			if(!list.contains(i)) {
				list1.add(i);
			}
		});

		list1.stream().forEach(i -> {
			System.out.println(i);
		});
	}
}
