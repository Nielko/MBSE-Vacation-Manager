/**
 */
package de.tu_bs.vacation_manager.Calender.tests;

import de.tu_bs.vacation_manager.Calender.CalenderFactory;
import de.tu_bs.vacation_manager.Calender.Week;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Week</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeekTest extends TestCase {

	/**
	 * The fixture for this Week test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Week fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WeekTest.class);
	}

	/**
	 * Constructs a new Week test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Week test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Week fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Week test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Week getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CalenderFactory.eINSTANCE.createWeek());
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

} //WeekTest
