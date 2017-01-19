/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.ecore.EFactory;

import de.tu_bs.vacation_manager.Calender.impl.custom.CalenderFactoryImplCustorm;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage
 * @generated
 */
public interface CalenderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	CalenderFactory eINSTANCE = new CalenderFactoryImplCustorm();//de.tu_bs.vacation_manager.Calender.impl.CalenderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calender</em>'.
	 * @generated
	 */
	Calender createCalender();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Holyday Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Holyday Application</em>'.
	 * @generated
	 */
	HolydayApplication createHolydayApplication();

	/**
	 * Returns a new object of class '<em>Responsible Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsible Person</em>'.
	 * @generated
	 */
	ResponsiblePerson createResponsiblePerson();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalenderPackage getCalenderPackage();

} //CalenderFactory
