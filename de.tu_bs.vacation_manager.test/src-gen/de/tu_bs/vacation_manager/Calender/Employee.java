/**
 */
package de.tu_bs.vacation_manager.Calender;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#getEmployee <em>Employee</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#getHolydayapplication <em>Holydayapplication</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Employee)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee_Employee()
	 * @model
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Employee#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

	/**
	 * Returns the value of the '<em><b>Holydayapplication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holydayapplication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holydayapplication</em>' reference.
	 * @see #setHolydayapplication(HolydayApplication)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee_Holydayapplication()
	 * @model
	 * @generated
	 */
	HolydayApplication getHolydayapplication();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Employee#getHolydayapplication <em>Holydayapplication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holydayapplication</em>' reference.
	 * @see #getHolydayapplication()
	 * @generated
	 */
	void setHolydayapplication(HolydayApplication value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createApplication();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendApplication();

} // Employee
