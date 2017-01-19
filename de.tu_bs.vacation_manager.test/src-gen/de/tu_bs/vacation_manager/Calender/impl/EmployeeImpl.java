/**
 */
package de.tu_bs.vacation_manager.Calender.impl;

import de.tu_bs.vacation_manager.Calender.CalenderPackage;
import de.tu_bs.vacation_manager.Calender.Employee;
import de.tu_bs.vacation_manager.Calender.HolydayApplication;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl#getHolydayapplication <em>Holydayapplication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected Employee employee;

	/**
	 * The cached value of the '{@link #getHolydayapplication() <em>Holydayapplication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolydayapplication()
	 * @generated
	 * @ordered
	 */
	protected HolydayApplication holydayapplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalenderPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getEmployee() {
		if (employee != null && employee.eIsProxy()) {
			InternalEObject oldEmployee = (InternalEObject)employee;
			employee = (Employee)eResolveProxy(oldEmployee);
			if (employee != oldEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalenderPackage.EMPLOYEE__EMPLOYEE, oldEmployee, employee));
			}
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetEmployee() {
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployee(Employee newEmployee) {
		Employee oldEmployee = employee;
		employee = newEmployee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalenderPackage.EMPLOYEE__EMPLOYEE, oldEmployee, employee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolydayApplication getHolydayapplication() {
		if (holydayapplication != null && holydayapplication.eIsProxy()) {
			InternalEObject oldHolydayapplication = (InternalEObject)holydayapplication;
			holydayapplication = (HolydayApplication)eResolveProxy(oldHolydayapplication);
			if (holydayapplication != oldHolydayapplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATION, oldHolydayapplication, holydayapplication));
			}
		}
		return holydayapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolydayApplication basicGetHolydayapplication() {
		return holydayapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolydayapplication(HolydayApplication newHolydayapplication) {
		HolydayApplication oldHolydayapplication = holydayapplication;
		holydayapplication = newHolydayapplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATION, oldHolydayapplication, holydayapplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createApplication() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendApplication() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalenderPackage.EMPLOYEE__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATION:
				if (resolve) return getHolydayapplication();
				return basicGetHolydayapplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalenderPackage.EMPLOYEE__EMPLOYEE:
				setEmployee((Employee)newValue);
				return;
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATION:
				setHolydayapplication((HolydayApplication)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CalenderPackage.EMPLOYEE__EMPLOYEE:
				setEmployee((Employee)null);
				return;
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATION:
				setHolydayapplication((HolydayApplication)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CalenderPackage.EMPLOYEE__EMPLOYEE:
				return employee != null;
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATION:
				return holydayapplication != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CalenderPackage.EMPLOYEE___CREATE_APPLICATION:
				createApplication();
				return null;
			case CalenderPackage.EMPLOYEE___SEND_APPLICATION:
				sendApplication();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmployeeImpl
