package make;

public class paixu {
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int num=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=num;
				}
			}
		}
		return arr;
	}
}
