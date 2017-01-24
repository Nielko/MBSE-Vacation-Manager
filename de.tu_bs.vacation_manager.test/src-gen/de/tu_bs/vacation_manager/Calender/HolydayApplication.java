/**
 */
package de.tu_bs.vacation_manager.Calender;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Holyday Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.HolydayApplication#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getHolydayApplication()
 * @model
 * @generated
 */
public interface HolydayApplication extends Date {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getHolydayApplication_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.HolydayApplication#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // HolydayApplication
