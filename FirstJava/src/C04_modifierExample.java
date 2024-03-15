
/*   Modifier	same Class	same Package   package& subclass  Other package(전체)	
 *  =========================================================================== 
 *   public			O			O				O					O
 *   protected		O			O				O					X
 *   default		O			O				X					X
 *   private		O			X				X					X
 *   
 *   접근 제한자는 클래스와 클래스 변수, 메서드, 생성자 등의 접근을 제어할 수 있는 제한자.
 *   (클래스의 경우에는 public과 default만 가능함. 단, 내부 클래스는 4가지 접근 제한자 다 가능) 
 *   
 */

import obj.modifier.Super;

public class C04_modifierExample {

	public static void main(String[] args) {
		System.out.println("***** Super 참조 *****");
		Super sup = new Super();
		System.out.println("num1 = "+sup.num1+   	//public
//						 "\tnum2 = "+sup.num2+	 	//protected
//						 "\tnum3 = "+sup.num3+	 	//default
						 "\tnum4 = "+sup.getNum4() 	//public method(private)
				);
		System.out.println("\n***** Sub 참조 *****");
		Sub sub = new Sub();
		sub.print();

	}

}
