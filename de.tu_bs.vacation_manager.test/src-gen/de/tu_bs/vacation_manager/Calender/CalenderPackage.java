/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.vacation_manager.Calender.CalenderFactory
 * @model kind="package"
 * @generated
 */
public interface CalenderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Calender";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tu-bs.de/isf/vacation_test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calender";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalenderPackage eINSTANCE = de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.impl.CalenderImpl <em>Calender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderImpl
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getCalender()
	 * @generated
	 */
	int CALENDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__DATES = 1;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__PERSONS = 2;

	/**
	 * The number of structural features of the '<em>Calender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Show Gui</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER___SHOW_GUI = 0;

	/**
	 * The number of operations of the '<em>Calender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.impl.DateImpl
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__PERSONS = 2;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.impl.PersonImpl
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Leave Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LEAVE_DAYS = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.impl.HolydayApplicationImpl <em>Holyday Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.impl.HolydayApplicationImpl
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getHolydayApplication()
	 * @generated
	 */
	int HOLYDAY_APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION__DAY = DATE__DAY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION__NAME = DATE__NAME;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION__PERSONS = DATE__PERSONS;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION__DAY_TYPE = DATE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION__ID = DATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION__NEW_ATTRIBUTE = DATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Holyday Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION_FEATURE_COUNT = DATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Holyday Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLYDAY_APPLICATION_OPERATION_COUNT = DATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.impl.ResponsiblePersonImpl <em>Responsible Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.impl.ResponsiblePersonImpl
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getResponsiblePerson()
	 * @generated
	 */
	int RESPONSIBLE_PERSON = 4;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON__DATES = PERSON__DATES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Leave Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON__LEAVE_DAYS = PERSON__LEAVE_DAYS;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON__EMPLOYEES = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Responsible Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON___ACCEPT_APPLICATION = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Decline Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON___DECLINE_APPLICATION = PERSON_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Responsible Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PERSON_OPERATION_COUNT = PERSON_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 5;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DATES = PERSON__DATES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Leave Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LEAVE_DAYS = PERSON__LEAVE_DAYS;

	/**
	 * The feature id for the '<em><b>Stand In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__STAND_IN = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Holydayapplications</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__HOLYDAYAPPLICATIONS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__RESPONSIBLE = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CREATE_APPLICATION = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___SEND_APPLICATION = PERSON_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.tu_bs.vacation_manager.Calender.WorkingDayType <em>Working Day Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.WorkingDayType
	 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getWorkingDayType()
	 * @generated
	 */
	int WORKING_DAY_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.vacation_manager.Calender.Calender <em>Calender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calender</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Calender
	 * @generated
	 */
	EClass getCalender();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Calender#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Calender#getName()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.vacation_manager.Calender.Calender#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dates</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Calender#getDates()
	 * @see #getCalender()
	 * @generated
	 */
	EReference getCalender_Dates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.vacation_manager.Calender.Calender#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Calender#getPersons()
	 * @see #getCalender()
	 * @generated
	 */
	EReference getCalender_Persons();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.vacation_manager.Calender.Calender#showGui() <em>Show Gui</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Gui</em>' operation.
	 * @see de.tu_bs.vacation_manager.Calender.Calender#showGui()
	 * @generated
	 */
	EOperation getCalender__ShowGui();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.vacation_manager.Calender.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Date#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date#getName()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.vacation_manager.Calender.Date#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date#getPersons()
	 * @see #getDate()
	 * @generated
	 */
	EReference getDate_Persons();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Date#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Type</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date#getDayType()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_DayType();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.vacation_manager.Calender.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.vacation_manager.Calender.Person#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dates</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Person#getDates()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Dates();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Person#getLeaveDays <em>Leave Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leave Days</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Person#getLeaveDays()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LeaveDays();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.vacation_manager.Calender.HolydayApplication <em>Holyday Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Holyday Application</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.HolydayApplication
	 * @generated
	 */
	EClass getHolydayApplication();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.HolydayApplication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.HolydayApplication#getId()
	 * @see #getHolydayApplication()
	 * @generated
	 */
	EAttribute getHolydayApplication_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.HolydayApplication#isNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.HolydayApplication#isNewAttribute()
	 * @see #getHolydayApplication()
	 * @generated
	 */
	EAttribute getHolydayApplication_NewAttribute();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.vacation_manager.Calender.ResponsiblePerson <em>Responsible Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Person</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.ResponsiblePerson
	 * @generated
	 */
	EClass getResponsiblePerson();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.vacation_manager.Calender.ResponsiblePerson#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.ResponsiblePerson#getEmployees()
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	EReference getResponsiblePerson_Employees();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.vacation_manager.Calender.ResponsiblePerson#acceptApplication() <em>Accept Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Application</em>' operation.
	 * @see de.tu_bs.vacation_manager.Calender.ResponsiblePerson#acceptApplication()
	 * @generated
	 */
	EOperation getResponsiblePerson__AcceptApplication();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.vacation_manager.Calender.ResponsiblePerson#declineApplication() <em>Decline Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decline Application</em>' operation.
	 * @see de.tu_bs.vacation_manager.Calender.ResponsiblePerson#declineApplication()
	 * @generated
	 */
	EOperation getResponsiblePerson__DeclineApplication();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.vacation_manager.Calender.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.vacation_manager.Calender.Employee#getStandIn <em>Stand In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stand In</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Employee#getStandIn()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_StandIn();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.vacation_manager.Calender.Employee#getHolydayapplications <em>Holydayapplications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holydayapplications</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Employee#getHolydayapplications()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Holydayapplications();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.vacation_manager.Calender.Employee#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Employee#getResponsible()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Responsible();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.vacation_manager.Calender.Employee#createApplication() <em>Create Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Application</em>' operation.
	 * @see de.tu_bs.vacation_manager.Calender.Employee#createApplication()
	 * @generated
	 */
	EOperation getEmployee__CreateApplication();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.vacation_manager.Calender.Employee#sendApplication() <em>Send Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Application</em>' operation.
	 * @see de.tu_bs.vacation_manager.Calender.Employee#sendApplication()
	 * @generated
	 */
	EOperation getEmployee__SendApplication();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.vacation_manager.Calender.WorkingDayType <em>Working Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Working Day Type</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.WorkingDayType
	 * @generated
	 */
	EEnum getWorkingDayType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalenderFactory getCalenderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.impl.CalenderImpl <em>Calender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderImpl
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getCalender()
		 * @generated
		 */
		EClass CALENDER = eINSTANCE.getCalender();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__NAME = eINSTANCE.getCalender_Name();

		/**
		 * The meta object literal for the '<em><b>Dates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDER__DATES = eINSTANCE.getCalender_Dates();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDER__PERSONS = eINSTANCE.getCalender_Persons();

		/**
		 * The meta object literal for the '<em><b>Show Gui</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALENDER___SHOW_GUI = eINSTANCE.getCalender__ShowGui();

		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.impl.DateImpl
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__NAME = eINSTANCE.getDate_Name();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE__PERSONS = eINSTANCE.getDate_Persons();

		/**
		 * The meta object literal for the '<em><b>Day Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY_TYPE = eINSTANCE.getDate_DayType();

		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.impl.PersonImpl
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Dates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DATES = eINSTANCE.getPerson_Dates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Leave Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LEAVE_DAYS = eINSTANCE.getPerson_LeaveDays();

		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.impl.HolydayApplicationImpl <em>Holyday Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.impl.HolydayApplicationImpl
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getHolydayApplication()
		 * @generated
		 */
		EClass HOLYDAY_APPLICATION = eINSTANCE.getHolydayApplication();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLYDAY_APPLICATION__ID = eINSTANCE.getHolydayApplication_Id();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLYDAY_APPLICATION__NEW_ATTRIBUTE = eINSTANCE.getHolydayApplication_NewAttribute();

		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.impl.ResponsiblePersonImpl <em>Responsible Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.impl.ResponsiblePersonImpl
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getResponsiblePerson()
		 * @generated
		 */
		EClass RESPONSIBLE_PERSON = eINSTANCE.getResponsiblePerson();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PERSON__EMPLOYEES = eINSTANCE.getResponsiblePerson_Employees();

		/**
		 * The meta object literal for the '<em><b>Accept Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESPONSIBLE_PERSON___ACCEPT_APPLICATION = eINSTANCE.getResponsiblePerson__AcceptApplication();

		/**
		 * The meta object literal for the '<em><b>Decline Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESPONSIBLE_PERSON___DECLINE_APPLICATION = eINSTANCE.getResponsiblePerson__DeclineApplication();

		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Stand In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__STAND_IN = eINSTANCE.getEmployee_StandIn();

		/**
		 * The meta object literal for the '<em><b>Holydayapplications</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__HOLYDAYAPPLICATIONS = eINSTANCE.getEmployee_Holydayapplications();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__RESPONSIBLE = eINSTANCE.getEmployee_Responsible();

		/**
		 * The meta object literal for the '<em><b>Create Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___CREATE_APPLICATION = eINSTANCE.getEmployee__CreateApplication();

		/**
		 * The meta object literal for the '<em><b>Send Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___SEND_APPLICATION = eINSTANCE.getEmployee__SendApplication();

		/**
		 * The meta object literal for the '{@link de.tu_bs.vacation_manager.Calender.WorkingDayType <em>Working Day Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.vacation_manager.Calender.WorkingDayType
		 * @see de.tu_bs.vacation_manager.Calender.impl.CalenderPackageImpl#getWorkingDayType()
		 * @generated
		 */
		EEnum WORKING_DAY_TYPE = eINSTANCE.getWorkingDayType();

	}

} //CalenderPackage
