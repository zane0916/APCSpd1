public class StatsDriver {
    public static void main(String[] args) {
	System.out.println(Stats.mean(5,6)); // 5
	System.out.println(Stats.mean(5.0,6.0)); // 5.5
	System.out.println(Stats.max(5,6)); // 6 
	System.out.println(Stats.max(5.0,6.0)); // 6.0
	System.out.println(Stats.max(5,5)); // 5
	System.out.println(Stats.max(5.0,5.0)); // 5.0
	System.out.println(Stats.geoMean(5,6)); // 5
	System.out.println(Stats.geoMean(5.0,6.0)); // 5.477225575051661
	System.out.println(Stats.max(5,6,7)); // 7
	System.out.println(Stats.max(5.0,6.0,7.0)); // 7.0
	System.out.println(Stats.geoMean(5,6,7)); // 5
	System.out.println(Stats.geoMean(5.0,6.0,7.0)); // 5.943921952763129
    }
}
