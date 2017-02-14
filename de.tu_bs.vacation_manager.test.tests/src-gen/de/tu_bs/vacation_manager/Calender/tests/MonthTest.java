/**
 */
package de.tu_bs.vacation_manager.Calender.tests;

import de.tu_bs.vacation_manager.Calender.CalenderFactory;
import de.tu_bs.vacation_manager.Calender.Month;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Month</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonthTest extends TestCase {

	/**
	 * The fixture for this Month test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Month fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MonthTest.class);
	}

	/**
	 * Constructs a new Month test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Month test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Month fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Month test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Month getFixture() {
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
		setFixture(CalenderFactory.eINSTANCE.createMonth());
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

} //MonthTest
