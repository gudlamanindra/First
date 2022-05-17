package StepDefinition;
public class StarPatterns {
    public static void main(String[] args) {
       System.out.println("1st");
       m1();
       System.out.println("2nd");
       m2();
       System.out.println("3rd");
       m3();
       System.out.println("4th");
       m4();
       System.out.println("5th");
       m5();
       System.out.println("6th");
       m6();
       System.out.println("7th");
       m7();
	}
public static void m1() {
	int n=5;
	for(int i = 0; i < n; i++) {
		for(int j = 0; j <= i; j++) {
			System.out.print("$ ");
		}
       System.out.println();
	}
}
public static void m2() {
	int n=5;
	for(int i = 0; i < n; i++) {
		for(int j = 2*(n-i);j > 2; j--) {
			System.out.print(" ");
		}
		for(int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
       System.out.println();
	}
}
public static void m3() {
	int n=5;
	for(int i = n; i > 0; i--) {
		for(int j = i; j > 0; j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
public static void m4() {
	int n=5;
	for(int i = 0; i < n; i++) {
		for(int j = n-i;j > 0; j--) {
			System.out.print(" ");
		}
		for(int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
	for( int i = 0; i < n; i++) {
		for(int j = 0; j <= i; j++) {
			System.out.print(" ");
		}
	    for(int j = n;j > i; j--) {
		System.out.print("* ");
	    }
	    System.out.println();
      }  
 }
public static void m5() {
	int n=5;
	for(int i = 0; i <= n; i++) {
		for(int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
       System.out.println();
	}
	for(int i = n; i > 0; i--) {
		for(int j = i; j > 0; j--) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
public static void m6() {
	int n=5;
	for(int i = 1;i <= n; i++) {
		for(int j = 1;j <= i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int i = n;i>1;i--) {
		
		for(int j = 1;j < i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	    
	}
  }
public static void m7() {
	int n=5;
	for(int i = 1; i <= n; i++) {
		for(int j = n;j > i; j--) {
			System.out.print(" ");
		}
		for(int j = 1; j<= i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	  }
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j<= i; j++) {
			System.out.print(" ");
		}
		for(int j = 1;j <=n-i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	  }
  }
}


