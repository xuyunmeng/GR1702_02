package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		// HashMap 集合类 用来储存东西
		// 电话本上的一个名字 ---> 对应一个手机号
		// 映射 key 键---> value 值
		// k和v必须是引用数据类型
		HashMap<Country, String> hashmap = new HashMap<Country, String>();

		Country china = new Country("china", 15);
		Country japan = new Country("japan", 14);
		Country india = new Country("india", 2);

		// 怎么同键key找到value
		String string = hashmap.get(china);
		System.out.println(string);
		String string1 = hashmap.get(japan);
		System.out.println(string1);
		String string2 = hashmap.get(india);
		System.out.println(string2);
		
		//遍历 迭代器
		Iterator<Entry<Country, String>> iterator = hashmap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString() + "" + value);

		}

	}

}
