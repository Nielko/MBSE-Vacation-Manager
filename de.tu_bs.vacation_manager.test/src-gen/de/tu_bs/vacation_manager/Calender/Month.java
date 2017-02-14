/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Month#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Month#getWeeks <em>Weeks</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getMonth()
 * @model
 * @generated
 */
public interface Month extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getMonth_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Month#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Weeks</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.vacation_manager.Calender.Week}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weeks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeks</em>' containment reference list.
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getMonth_Weeks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Week> getWeeks();

} // Month
