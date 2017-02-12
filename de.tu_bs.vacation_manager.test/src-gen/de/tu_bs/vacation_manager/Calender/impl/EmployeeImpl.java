/**
 */
package de.tu_bs.vacation_manager.Calender.impl;

import de.tu_bs.vacation_manager.Calender.CalenderPackage;
import de.tu_bs.vacation_manager.Calender.Employee;
import de.tu_bs.vacation_manager.Calender.HolydayApplication;

import de.tu_bs.vacation_manager.Calender.ResponsiblePerson;
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
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl#getStandIn <em>Stand In</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl#getHolydayapplications <em>Holydayapplications</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.EmployeeImpl#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
	/**
	 * The cached value of the '{@link #getStandIn() <em>Stand In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandIn()
	 * @generated
	 * @ordered
	 */
	protected Employee standIn;

	/**
	 * The cached value of the '{@link #getHolydayapplications() <em>Holydayapplications</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolydayapplications()
	 * @generated
	 * @ordered
	 */
	protected HolydayApplication holydayapplications;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected ResponsiblePerson responsible;

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
	public Employee getStandIn() {
		if (standIn != null && standIn.eIsProxy()) {
			InternalEObject oldStandIn = (InternalEObject)standIn;
			standIn = (Employee)eResolveProxy(oldStandIn);
			if (standIn != oldStandIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalenderPackage.EMPLOYEE__STAND_IN, oldStandIn, standIn));
			}
		}
		return standIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetStandIn() {
		return standIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandIn(Employee newStandIn) {
		Employee oldStandIn = standIn;
		standIn = newStandIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalenderPackage.EMPLOYEE__STAND_IN, oldStandIn, standIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolydayApplication getHolydayapplications() {
		if (holydayapplications != null && holydayapplications.eIsProxy()) {
			InternalEObject oldHolydayapplications = (InternalEObject)holydayapplications;
			holydayapplications = (HolydayApplication)eResolveProxy(oldHolydayapplications);
			if (holydayapplications != oldHolydayapplications) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATIONS, oldHolydayapplications, holydayapplications));
			}
		}
		return holydayapplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HolydayApplication basicGetHolydayapplications() {
		return holydayapplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolydayapplications(HolydayApplication newHolydayapplications) {
		HolydayApplication oldHolydayapplications = holydayapplications;
		holydayapplications = newHolydayapplications;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATIONS, oldHolydayapplications, holydayapplications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePerson getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (ResponsiblePerson)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalenderPackage.EMPLOYEE__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePerson basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(ResponsiblePerson newResponsible) {
		ResponsiblePerson oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalenderPackage.EMPLOYEE__RESPONSIBLE, oldResponsible, responsible));
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
			case CalenderPackage.EMPLOYEE__STAND_IN:
				if (resolve) return getStandIn();
				return basicGetStandIn();
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATIONS:
				if (resolve) return getHolydayapplications();
				return basicGetHolydayapplications();
			case CalenderPackage.EMPLOYEE__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
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
			case CalenderPackage.EMPLOYEE__STAND_IN:
				setStandIn((Employee)newValue);
				return;
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATIONS:
				setHolydayapplications((HolydayApplication)newValue);
				return;
			case CalenderPackage.EMPLOYEE__RESPONSIBLE:
				setResponsible((ResponsiblePerson)newValue);
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
			case CalenderPackage.EMPLOYEE__STAND_IN:
				setStandIn((Employee)null);
				return;
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATIONS:
				setHolydayapplications((HolydayApplication)null);
				return;
			case CalenderPackage.EMPLOYEE__RESPONSIBLE:
				setResponsible((ResponsiblePerson)null);
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
			case CalenderPackage.EMPLOYEE__STAND_IN:
				return standIn != null;
			case CalenderPackage.EMPLOYEE__HOLYDAYAPPLICATIONS:
				return holydayapplications != null;
			case CalenderPackage.EMPLOYEE__RESPONSIBLE:
				return responsible != null;
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
