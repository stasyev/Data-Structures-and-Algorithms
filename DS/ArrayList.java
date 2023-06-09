public class ArrayList<E>{
	int size = 0;
	Object[] array;
	int DEFAULT_CAPACITY = 10;
	ArrayList(){
	
		this.array = new Object[DEFAULT_CAPACITY];
	}

	void add(Object num){
		array[size] = num;
		size++;
	}


	Object get(int index){
	  return array[index];		
	}
	
	// remove item at an index
	// shift the rest to the left
	void remove(int index){
		array[index] = new Object();
		size--;
	}

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
	
		ArrayList<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hi Mom!");

		System.out.println("First element in the arraylist: " + list.get(0));
		System.out.println("First element in the arraylist: " + listOfStrings.get(0));
	}
}
