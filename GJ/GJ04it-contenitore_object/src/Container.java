/**
 * Esempio di classe contenitore di oggetti
 * @author aferrari@ce.unipr.it
 *
 */
public class Container {
	private Object element;
	public Container() {
		this.element = null;
	}
	public Container(Object element) {
		this.element = element;
	}
	/**
	 * @return the element
	 */
	public Object getElement() {
		return element;
	}
	/**
	 * @param element the element to set
	 */
	public void setElement(Object element) {
		this.element = element;
	}
}
