 package study.chapter06.pkgEx.ex2;

import study.chapter06.pkgEx.ex1.ClassB;

class ClassC { // default 접근 제한자 (같은 패키지만 접근 가능)
	// ClassA a; //default : 다른패키지에서 접근 불가하니까 import도 불가
	ClassB b; //public 

}
