/**
 */
package de.tu_bs.vacation_manager.Calender.tests;

import de.tu_bs.vacation_manager.Calender.CalenderFactory;
import de.tu_bs.vacation_manager.Calender.Employee;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#createApplication() <em>Create Application</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.Employee#sendApplication() <em>Send Application</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EmployeeTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmployeeTest.class);
	}

	/**
	 * Constructs a new Employee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Employee getFixture() {
		return (Employee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CalenderFactory.eINSTANCE.createEmployee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link de.tu_bs.vacation_manager.Calender.Employee#createApplication() <em>Create Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.Employee#createApplication()
	 * @generated
	 */
	public void testCreateApplication() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.tu_bs.vacation_manager.Calender.Employee#sendApplication() <em>Send Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.vacation_manager.Calender.Employee#sendApplication()
	 * @generated
	 */
	public void testSendApplication() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EmployeeTest
