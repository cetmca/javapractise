package com.balazsholczer.facade;

public class SortingManager {

	private Algorithm bubbleSort;
	private Algorithm mergeSort;
	private Algorithm heapSort;
	private Algorithm quickSort;
	
	public SortingManager(){
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.heapSort = new HeapSort();
		this.quickSort= new QuickSort();
	}
	
	public void mergeSort(){
		this.mergeSort.sort();
	}
	
	public void bubbleSort(){
		this.bubbleSort.sort();
	}
	
	public void heapSort(){
		this.heapSort.sort();
	}
	public void quickSort(){
		this.quickSort.sort();
	}
}
