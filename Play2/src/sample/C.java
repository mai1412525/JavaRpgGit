package sample;

public class C {
	
	public static void main(String[] args) {
		int[] weight = {85, 77, 69, 55, 62, 88, 69, 105 };
		double ave;
		ave = calcAve(weight);
		System.out.printf("平均体重は%3.1fkgです",ave);
		
	}
	
	static double calcAve(int[]weight) {
		int total=0;
		
		for(int w: weight) {
			total += w;
		}
		return(double)total/weight.length;
	}
	
}
