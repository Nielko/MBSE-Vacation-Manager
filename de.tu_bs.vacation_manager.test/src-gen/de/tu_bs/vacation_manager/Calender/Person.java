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

} // Person
