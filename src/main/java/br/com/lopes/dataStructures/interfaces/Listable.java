package br.com.lopes.dataStructures.interfaces;

public interface Listable {

	/*
	 * Adds an element to data structure.
	 * 
	 * @param value -> value which will be added on structure.
	 * 
	 */
	public void add(Integer value);

	/*
	 * Get element from received index.
	 * 
	 * @param index -> index of the value which will be returned.
	 * 
	 * @throws IndexOutOfBounds when received index is bigger than elements size.
	 * 
	 * @throws IndexOutOfBounds when list doesn't have any element.
	 * 
	 */
	public Integer get(Integer index);

	/*
	 * Return total of elements.
	 * 
	 * @return Integer number of elements.
	 * 
	 */
	public Integer size();

	/*
	 * Verify if received value is present.
	 * 
	 * @param value -> value which will be checked if exists or not on data
	 * structure.
	 * 
	 * @return boolean -> true if value exist and false if doesn't
	 * 
	 */
	public boolean contains(Integer value);

	/*
	 * Remove element of received position.
	 * 
	 * @param index -> index of the element which will be removed.
	 * 
	 * @throws IndexOutOfBounds when received index is bigger than elements size.
	 * 
	 * @throws IndexOutOfBounds when list doesn't have any element.
	 * 
	 */
	public void remove(Integer index);

	/*
	 * Return first element.
	 * 
	 * @return Integer with first element value.
	 * 
	 * @throws IndexOutOfBounds when doesn't have any element.
	 * 
	 */
	public Integer first();

	/*
	 * Return last element.
	 * 
	 * @return Integer with last element value.
	 * 
	 * @throws IndexOutOfBounds when doesn't have any element.
	 * 
	 */
	public Integer last();
}
