package hello;

import java.util.function.Predicate;

public class check<T> implements Predicate<T>{
		T value;
		
		//constructor to initialize value to check
		check(T _value) {
			this.value = _value;
		}
		


		@Override
		public boolean test(T t) {
			if(t == value) {
				return true;
			}
			return false;
		}
		
	}
