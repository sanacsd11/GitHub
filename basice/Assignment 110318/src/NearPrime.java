class NearPrime {
	public static void nprime(int n) {
		int up, dn, a;
		up = n + 1;

		while (true) {
			a = isprime(up);
			if (a == 0)
				break;
			up++;
		}
		dn = n - 1;
		while (true) {
			a = isprime(dn);
			if (a == 0)
				break;
			dn--;
		}
		System.out.print("the nearest prime number is");
		if ((n - dn) < (up - n))
			System.out.println(dn);
		else if ((up - n) < (n - dn))
			System.out.println(up);
		else
			System.out.println(up + " " + dn);
	}

	public static int isprime(int a) {
		int f = 0;
		for (int j = 2; j <= a / 2; j++) {
			if (a % j == 0) {
				f = 1;
				break;
			}
		}
		return f;
	}
}