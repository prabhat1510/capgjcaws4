package dayseven.functionalinterface.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo<T> {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		
		//LocalDateTime localDateTime =LocalDateTime.now();
		
		Supplier<LocalDateTime> s = ()->LocalDateTime.now();
		LocalDateTime time = s.get();//get method accepts no arguments but supplies a new object of type T i.e. LocalDateTime
		System.out.println(time);
		
		Supplier<String> s11 = ()->dtf.format(LocalDateTime.now());
		String time2 = s11.get();
		System.out.println(time2);
		
		SupplierDemo<String> obj = new SupplierDemo<String>();
		//Supplier<List<String>> o=obj.supplier();
		//o.get();
		List<String> list = obj.supplier().get();
		//List<String> list = new ArrayList<>();
	}
	
	//normal method name supplier is return an instance of Supplier Functional Interface
	public Supplier<List<T>> supplier(){
		//lambda
		return ()-> new ArrayList<>();
		//Constructor Reference
		//return ArrayList::new; //method reference concept is used to invoke constructor
	}

}
