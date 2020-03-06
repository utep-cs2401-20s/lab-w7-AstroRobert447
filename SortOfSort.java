public class SortOfSort {
	private int[] array;
	private String j;
	
	public static void main(String [] arg) {
		
	}
	SortOfSort(int[] A){
		array = A;
	}
	
	public int[] getArray () {
		return this.array;
	}

	public void sortOfSort() {

		int numGreat = array.length;//Step 1
		int numLow = 0;
				for(int j = 0; j <= array.length; j++){//Step 2
					if(array[numGreat] < array[j]){
						array[numGreat] = array[j];
					}
				}	
						System.out.print("\t Great Array[" + j + "] = " + array[numGreat]);

				numGreat--;
				for(int j = array.length; j <= array.length; j++){//Function #2
					if(array[numGreat] < array[j] && array[j] < array[numGreat + 1]){
						array[numGreat] = array[j];
					}
				}	
						System.out.print("\t Great Array[" + j + "] = " + array[numGreat]);



				for(int j = 0; j <= array.length; j++){//Function #3
					if(array[numLow]  < array[j] && array[j] < array[numGreat]){
						array[numLow] = array[j];
					}
				}	
						System.out.print("Small Array[" + j + "] = " + array[numLow]);

	 			numLow++;
				for(int j = 3; j <= array.length; j++){//Function #4
					if(array[numLow] < array[j] && array[j] < array[numLow - 1]){
						array[numLow] = array[j];
					}
				}	
						System.out.print("Small Array[" + j + "] = " + array[numLow]);




			for(int i = 4; i <= array.length;){//Step 3
				if(array[i] == array.length){
					break;
				}
				else{
					i++;
					numGreat--;
				}
					
				for(int j = 0; j <= array.length; j++){
					if(array[numGreat] < array[j] && array[j] < array[numLow + 1]){
						array[numGreat] = array[j];
					}
				}	
						System.out.print("\t Great Array[" + j + "] = " + array[numGreat]);
		

				if(array[i] == array.length){
					break;
				}
				else{
					i++;
					numGreat--;
				}
				for(int j = array.length; j <= array.length; j++){
					if(array[numGreat] < array[j] && array[j] < array[numGreat + 1]){
						array[numGreat] = array[j];
					}
					System.out.print("\t Great Array[" + j + "] = " + array[numGreat]);
				}	


				if(array[i] == array.length){
					break;
				}
				else{
					i++;
					numLow++;
				}
				for(int j = 0; j <= array.length; j++){
					if(array[numLow]  < array[j] && array[j] < array[numGreat]){
						array[numLow] = array[j];
					}
					System.out.print("Small Array[" + j + "] = " + array[numLow]);
				}	
						

	 			if(array[i] == array.length){
					break;
				}
				else{
					i++;
					numLow++;
				}
				for(int j = 0; j <= array.length; j++){
					if(array[numLow] < array[j] && array[j] < array[numLow - 1]){
						array[numLow] = array[j];
					}
					System.out.print("Small Array[" + j + "] = " + array[numLow]);
				}	
						
			}
	}
}
