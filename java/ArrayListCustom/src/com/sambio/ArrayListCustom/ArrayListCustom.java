package com.sambio.ArrayListCustom;

public class ArrayListCustom<E> {
	private static final int DEFAULT_CAPACITY = 16;
	private int size;
	private E[] data;
	
	public ArrayListCustom() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayListCustom(int capacity) {
		clear();
		ensureCapacity(capacity);
	}

	public void set(int idx, E val) {
		if (idx < 0 || idx > size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		data[idx] = val;
	}
	
	public E get(int idx) {
		if (idx < 0 || idx > size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		E elem = data[idx];
		return elem;
	}

	public void add(E val) {
		if (this.size == this.data.length) {
			ensureCapacity(this.data.length * 2);
		}
		
		data[size++] = val;
		
	}
	
	public E remove(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		E elem = data[idx];
		shift(idx);
		this.size--;
		if (this.data.length / 4 == size()) {
			ensureCapacity(this.data.length / 2);
		}
		return elem;
	}

	private void shift(int idx) {
		for (int i = idx; i < this.data.length - 1; i++) {
			this.data[i] = this.data[i + 1];
		}
	}

	public void clear() {
		this.size = 0;
	}
	public int size() {
		return size;
	}
	private void ensureCapacity(int capacity) {
		if (capacity < 0) {
			return;
		}
		E[] copy = data;
		data = (E[]) new Object[capacity];
		for (int i = 0; i < size(); i++) {
			data[i] = copy[i];
		}
	}
	
	public void display() {
		for (int i = 0; i < size(); i++) {
			System.out.println("index at " + i + " = " + data[i] + " ");
		}
	}
}
