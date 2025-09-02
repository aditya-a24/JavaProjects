package objectClass;

public class EmployDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
//		Employ e1 = new Employ();
//		System.out.println(e1);
//		System.out.println(e1.toString());
//		System.out.println(e1.hashCode());
//		System.out.println(Integer.toHexString(e1.hashCode()));
		
		Employ e1 = new Employ("Mohan", 123, 46477.67);
		Employ e2 = new Employ("Sohan", 103, 46477.67);
		Employ e3 = new Employ("Mohan", 123, 46477.67);
		System.out.println("========= toString() =========");
		System.out.println(e1);
		System.out.println(e2.toString());
		System.out.println(e3);
		System.out.println("========= getClass() =========");
		System.out.println(e1.getClass());
		System.out.println(e1.getClass().getName());
		System.out.println(e1.getClass().getSimpleName());
		System.out.println("======== hashCode() ==========");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("======== equals() ========");
		System.out.println(e1 == e2);
		System.out.println(e1 == e3);
		System.out.println("==============");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println("========== clone() ===========");
		Employ eCopy = (Employ) e1.clone();
		e1.id = 1200;
		e1.name = "John";
		System.out.println(eCopy);
		System.out.println("========== finalaize() ===========");
		e1 = null;
		e2 = null;
		System.gc();
	}
}
