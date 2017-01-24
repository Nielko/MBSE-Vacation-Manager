/**
 */
package de.tu_bs.vacation_manager.Calender.tests;

import de.tu_bs.vacation_manager.Calender.CalenderFactory;
import de.tu_bs.vacation_manager.Calender.HolydayApplication;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Holyday Application</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HolydayApplicationTest extends DateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HolydayApplicationTest.class);
	}

	/**
	 * Constructs a new Holyday Application test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolydayApplicationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Holyday Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HolydayApplication getFixture() {
		return (HolydayApplication)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CalenderFactory.eINSTANCE.createHolydayApplication());
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

} //HolydayApplicationTest
