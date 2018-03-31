/**
 * Esempio di classe contenitore generica
 * @author aferrari@ce.unipr.it
 *
 */
public class Container <E> {
	private E element;
	public Container() {
		this.element = null;
	}
	public Container(E element) {
		this.element = element;
	}
	/**
	 * @return the element
	 */
	public E getElement() {
		return element;
	}
	/**
	 * @param element the element to set
	 */
	public void setElement(E element) {
		this.element = element;
	}
}