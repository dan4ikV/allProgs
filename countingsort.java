import java.util.Random;

public class countingsort {

	public static void main(String[] args) {
		    int k = 100;
			int input[] = new int[100];
			Random rand = new Random();
			for (int i = 0; i < 100; i++) {
				input[i] = rand.nextInt(99) + 0;
			}
		    // create buckets
		    int counter[] = new int[k + 1];
		    // fill buckets
		    for (int i : input) {
		      counter[i]++;
		    }
		    // sort array
		    int ndx = 0;
		    for (int i = 0; i < counter.length; i++) {
		      while (0 < counter[i]) {
		        input[ndx++] = i;
		        counter[i]--;
		      }
		    }
		    for(int i = 0; i < k;i ++){
		    System.out.print(input[i] + " ");
		    }
	}
}

