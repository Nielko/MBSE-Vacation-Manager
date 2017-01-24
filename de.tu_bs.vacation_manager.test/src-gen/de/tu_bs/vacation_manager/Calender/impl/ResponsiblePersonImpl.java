/**
 */
package de.tu_bs.vacation_manager.Calender.impl;

import de.tu_bs.vacation_manager.Calender.CalenderPackage;
import de.tu_bs.vacation_manager.Calender.ResponsiblePerson;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponsiblePersonImpl extends PersonImpl implements ResponsiblePerson {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsiblePersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalenderPackage.Literals.RESPONSIBLE_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void acceptApplication() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void declineApplication() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CalenderPackage.RESPONSIBLE_PERSON___ACCEPT_APPLICATION:
				acceptApplication();
				return null;
			case CalenderPackage.RESPONSIBLE_PERSON___DECLINE_APPLICATION:
				declineApplication();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ResponsiblePersonImpl
