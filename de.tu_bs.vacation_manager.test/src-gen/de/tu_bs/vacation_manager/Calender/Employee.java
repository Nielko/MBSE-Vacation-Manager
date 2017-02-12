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
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#getStandIn <em>Stand In</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#getHolydayapplications <em>Holydayapplications</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Stand In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stand In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stand In</em>' reference.
	 * @see #setStandIn(Employee)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee_StandIn()
	 * @model
	 * @generated
	 */
	Employee getStandIn();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Employee#getStandIn <em>Stand In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stand In</em>' reference.
	 * @see #getStandIn()
	 * @generated
	 */
	void setStandIn(Employee value);

	/**
	 * Returns the value of the '<em><b>Holydayapplications</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holydayapplications</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holydayapplications</em>' reference.
	 * @see #setHolydayapplications(HolydayApplication)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee_Holydayapplications()
	 * @model
	 * @generated
	 */
	HolydayApplication getHolydayapplications();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Employee#getHolydayapplications <em>Holydayapplications</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holydayapplications</em>' reference.
	 * @see #getHolydayapplications()
	 * @generated
	 */
	void setHolydayapplications(HolydayApplication value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(ResponsiblePerson)
	 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getEmployee_Responsible()
	 * @model
	 * @generated
	 */
	ResponsiblePerson getResponsible();

	/**
	 * Sets the value of the '{@link de.tu_bs.vacation_manager.Calender.Employee#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(ResponsiblePerson value);

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
