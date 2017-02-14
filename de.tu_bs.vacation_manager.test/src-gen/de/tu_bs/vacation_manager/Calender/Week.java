/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Week#getDates <em>Dates</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Week#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getWeek()
 * @model
 * @generated
 */
public interface Week extends EObject {
	/**
	 * Returns the value of the '<em><b>Dates</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.vacation_manager.Calender.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dates</em>' reference list.
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getWeek_Dates()
	 * @model
	 * @generated
	 */
	EList<Date> getDates();

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
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getWeek_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Week#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Week
