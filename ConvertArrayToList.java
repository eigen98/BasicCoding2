package Basic;

import java.util.*;

public class ArrayConvert {

	public static void main(String[] args) {
		int[][] nums = { { 1, 2 }, { 2, 3 } };
		int[] nums1 = { 1, 2 };
		System.out.println(convert_ArrayTolist_1(nums1));
//		List<List<Integer>> result = convert_ArrayTolist(nums);
//		int[][] array = convert_ListToArray(result);
	}

	// 1 array-> list
	private static List<Integer> convert_ArrayTolist_1(int[] nums) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			result.add(nums[i]);
		}
		System.out.println(result);
		return result;
	}

	// 1 list -> array
	private static int[] convert_ArrayToList(List<Integer> list) {
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	// 2 array-> list
	private static List<List<Integer>> convert_ArrayTolist(int[][] nums) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			List<Integer> sList = new ArrayList<>();
			for (int j = 0; j < nums[i].length; j++) {
				sList.add(nums[i][j]);
			}
			result.add(sList);
		}
		return result;
	}
	// 2  list -> array
	private static int[][] convert_ListToArray(List<List<Integer>> list) {
		int[][] array = new int[list.size()][];

		for (int i = 0; i < array.length; i++) {
			array[i] = new int[list.get(i).size()];
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				array[i][j] = list.get(i).get(j);
			}
		}
		return array;
	}
	// 2  list -> List<int[]>
	private static List<int[]> convert_ListInArray(List<List<Integer>> list) {
		List<int[]> intArrayList = new ArrayList<>();

		for (List<Integer> intList : list) {
			int[] intArray = new int[intList.size()];
			for (int i = 0; i < intArray.length; ++i) {
				intArray[i] = intList.get(i);
			}
			intArrayList.add(intArray);
		}
		return intArrayList;

	}
}
