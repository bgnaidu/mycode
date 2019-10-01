package com.naidu.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ju {
	public static int solution(int[] A) {
		ArrayList<Integer> list = IntStream.of(A).boxed().collect(Collectors.toCollection(ArrayList::new));
		List<Integer> negitiveList = new ArrayList<Integer>();
		list.forEach(i -> {
			if (i <= 0) {
				negitiveList.add(i);
			}
		});
		System.out.println(negitiveList);
		Collections.sort(negitiveList);
		System.out.println(negitiveList);

		return negitiveList.get(negitiveList.size() - 1);

	}

}
