package in.ashokit;

import java.lang.reflect.Field;

public class Demo {
	public static void main(String[] args) throws Exception {
		User user=new User();
		System.out.println(user.getAge());
		Class clazz=Class.forName("in.ashokit.User");
		Field field=clazz.getDeclaredField("age");
		field.setAccessible(true);
		Object object=clazz.newInstance();
		field.set(object, 25);
		User u=(User)object;
		System.out.println(u.getAge());
		
	}

}
