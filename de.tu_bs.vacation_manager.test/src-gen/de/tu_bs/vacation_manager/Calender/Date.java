/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Date#getDay <em>Day</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Date#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Date#getPersons <em>Persons</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Date#getDayType <em>Day Type</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(java.util.Date)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getDate_Day()
	 * @model
	 * @generated
	 */
	java.util.Date getDay();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Date#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(java.util.Date value);

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
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getDate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Date#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.vacation_manager.Calender.Person}.
	 * It is bidirectional and its opposite is '{@link de.tu_bs.vacation_manager.Calender.Person#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getDate_Persons()
	 * @see de.tu_bs.vacation_manager.Calender.Person#getDates
	 * @model opposite="dates"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Day Type</b></em>' attribute.
	 * The default value is <code>"WorkingDay"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.vacation_manager.Calender.WorkingDayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Type</em>' attribute.
	 * @see de.tu_bs.vacation_manager.Calender.WorkingDayType
	 * @see #setDayType(WorkingDayType)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getDate_DayType()
	 * @model default="WorkingDay" required="true"
	 * @generated
	 */
	WorkingDayType getDayType();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Date#getDayType <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Type</em>' attribute.
	 * @see de.tu_bs.vacation_manager.Calender.WorkingDayType
	 * @see #getDayType()
	 * @generated
	 */
	void setDayType(WorkingDayType value);

} // Date
