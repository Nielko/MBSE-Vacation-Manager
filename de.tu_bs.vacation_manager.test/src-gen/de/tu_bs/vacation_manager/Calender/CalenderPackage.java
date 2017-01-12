/**
 */
package de.tu_bs.vacation_manager.Calender;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__DATE = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__PERSON = 2;

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
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__PERSON = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Date</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.vacation_manager.Calender.Calender#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Calender#getDate()
	 * @see #getCalender()
	 * @generated
	 */
	EReference getCalender_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.vacation_manager.Calender.Calender#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Calender#getPerson()
	 * @see #getCalender()
	 * @generated
	 */
	EReference getCalender_Person();

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
	 * Returns the meta object for the attribute '{@link de.tu_bs.vacation_manager.Calender.Date#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date#getDate()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Date();

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
	 * Returns the meta object for the reference list '{@link de.tu_bs.vacation_manager.Calender.Date#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Date#getPerson()
	 * @see #getDate()
	 * @generated
	 */
	EReference getDate_Person();

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
	 * Returns the meta object for the reference list '{@link de.tu_bs.vacation_manager.Calender.Person#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Date</em>'.
	 * @see de.tu_bs.vacation_manager.Calender.Person#getDate()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Date();

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
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDER__DATE = eINSTANCE.getCalender_Date();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDER__PERSON = eINSTANCE.getCalender_Person();

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
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DATE = eINSTANCE.getDate_Date();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__NAME = eINSTANCE.getDate_Name();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE__PERSON = eINSTANCE.getDate_Person();

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
		 * The meta object literal for the '<em><b>Date</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DATE = eINSTANCE.getPerson_Date();

	}

} //CalenderPackage
