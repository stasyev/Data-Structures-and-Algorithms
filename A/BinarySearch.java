class BinarySearch{

	// return the index of the lostSheep
	public static int BinarySearch(int[] array, int lostSheep){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
			int mid = low + (high - low) / 2;
			if(array[mid] > lostSheep){
				high = mid - 1;
			}else if(array[mid] < lostSheep){
				low = mid + 1;
			}else{
				return mid;
			}
			
		}
		return -1;
	}
	public static void main(String[] args){
		int[] array = {1, 2, 4, 6, 3};
		System.out.println(BinarySearch(array, 6)); // should return 3
	}
}
