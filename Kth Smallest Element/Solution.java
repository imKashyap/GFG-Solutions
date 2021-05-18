import java.util.*;
class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {
		int value = number1.compareTo(number2);
		if (value > 0) {
			return -1;
		}
		else if (value < 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
class GFG{
static void kthSmallest(int []v, int N, int K){
	PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>(new CustomComparator());

	for (int i = 0; i < N; ++i) {
		heap1.add(v[i]);
		if (heap1.size() > K) {
			heap1.remove();
		}
	}
	System.out.print(heap1.peek() +"\n");
}

public static void main(String[] args)
{
	int []vec = { 5, 20, 10, 7, 1 };
	int N = vec.length;
	int K = 2;
	kthSmallest(vec, N, K % N);
}
}
