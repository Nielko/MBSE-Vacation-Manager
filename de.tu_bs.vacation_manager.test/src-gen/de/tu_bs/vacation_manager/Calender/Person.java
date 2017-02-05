/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Person#getDate <em>Date</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Person#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Person#getLeaveDays <em>Leave Days</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.vacation_manager.Calender.Date}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.vacation_manager.Calender.Date#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' reference list.
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getPerson_Date()
	 * @see de.tu_bs.vacation_manager.Calender.Date#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<Date> getDate();

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
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Leave Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Days</em>' attribute.
	 * @see #setLeaveDays(int)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getPerson_LeaveDays()
	 * @model
	 * @generated
	 */
	int getLeaveDays();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Person#getLeaveDays <em>Leave Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Days</em>' attribute.
	 * @see #getLeaveDays()
	 * @generated
	 */
	void setLeaveDays(int value);

} // Person
