package java_array_problems;

import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		int n;
		double mean;
		StandardDeviation sd = new StandardDeviation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers :");
		n = sc.nextInt();
		double a[] = new double[n];

		System.out.println("Enter the numbers");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
		}
		mean = sd.findMean(a, n);
		System.out.println("Mean :" + mean);
		System.out.println("Standard Deviation : " + sd.findSD(a, mean, n));
		sc.close();
	}

	private double findSD(double[] a, double mean, int n) {
		double sd = 0.0;
		for (double m : a) {
			sd += Math.pow(m - mean, 2);
		}
		sd = Math.sqrt(sd / n);
		return sd;

	}

	private double findMean(double[] a, int n) {
		int mean = 0;
		for (double m : a) {
			mean += m;
		}
		return mean / n;
	}

}
