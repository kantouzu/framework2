package com.cisdi.base.util;

public class SortUtils {

	public static void sort2up(Object[] arr) {
		int i = 0;
		int j = arr.length - 1;
		sort(arr, i, j);
	}

	public static void sort(Object[] arr, int a, int b) {
		if (a < b) {
			int i = a;
			int j = b;
			String key = arr[i].toString();
			while (i < j) {
				/* 按j--方向遍历目标数组，直到比key小的值为止 */
				while (j > i && arr[j].toString().compareTo(key) >= 0) {
					j--;
				}
				if (i < j) {
					/* arr[i]已经保存在key中，可将后面的数填入 */
					arr[i] = arr[j];
					i++;
				}
				/* 按i++方向遍历目标数组，直到比key大的值为止 */
				while (i < j && arr[i].toString().compareTo(key) <= 0)
				/*
				 * 此处一定要小于等于零，假设数组之内有一亿个1，0交替出现的话，而key的值又恰巧是1的话，
				 * 那么这个小于等于的作用就会使下面的if语句少执行一亿次。
				 */
				{
					i++;
				}
				if (i < j) {
					/* arr[j]已保存在arr[i]中，可将前面的值填入 */
					arr[j] = arr[i];
					j--;
				}
			}
			/* 此时i==j */
			arr[i] = key;

			/* 递归调用，把key前面的完成排序 */
			sort(arr, a, i - 1);

			/* 递归调用，把key后面的完成排序 */
			sort(arr, j + 1, b);
		}
	}
}
