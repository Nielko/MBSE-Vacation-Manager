/**
 */
package de.tu_bs.vacation_manager.Calender.impl;

import de.tu_bs.vacation_manager.Calender.Calender;
import de.tu_bs.vacation_manager.Calender.CalenderPackage;
import de.tu_bs.vacation_manager.Calender.Date;
import de.tu_bs.vacation_manager.Calender.Month;
import de.tu_bs.vacation_manager.Calender.Person;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.CalenderImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.CalenderImpl#getDates <em>Dates</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.CalenderImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link de.tu_bs.vacation_manager.Calender.impl.CalenderImpl#getMonths <em>Months</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalenderImpl extends MinimalEObjectImpl.Container implements Calender {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDates() <em>Dates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDates()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> dates;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getMonths() <em>Months</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonths()
	 * @generated
	 * @ordered
	 */
	protected EList<Month> months;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalenderPackage.Literals.CALENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalenderPackage.CALENDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDates() {
		if (dates == null) {
			dates = new EObjectContainmentEList<Date>(Date.class, this, CalenderPackage.CALENDER__DATES);
		}
		return dates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, CalenderPackage.CALENDER__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Month> getMonths() {
		if (months == null) {
			months = new EObjectContainmentEList<Month>(Month.class, this, CalenderPackage.CALENDER__MONTHS);
		}
		return months;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void showGui() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CalenderPackage.CALENDER__DATES:
				return ((InternalEList<?>)getDates()).basicRemove(otherEnd, msgs);
			case CalenderPackage.CALENDER__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case CalenderPackage.CALENDER__MONTHS:
				return ((InternalEList<?>)getMonths()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalenderPackage.CALENDER__NAME:
				return getName();
			case CalenderPackage.CALENDER__DATES:
				return getDates();
			case CalenderPackage.CALENDER__PERSONS:
				return getPersons();
			case CalenderPackage.CALENDER__MONTHS:
				return getMonths();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalenderPackage.CALENDER__NAME:
				setName((String)newValue);
				return;
			case CalenderPackage.CALENDER__DATES:
				getDates().clear();
				getDates().addAll((Collection<? extends Date>)newValue);
				return;
			case CalenderPackage.CALENDER__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case CalenderPackage.CALENDER__MONTHS:
				getMonths().clear();
				getMonths().addAll((Collection<? extends Month>)newValue);
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
			case CalenderPackage.CALENDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CalenderPackage.CALENDER__DATES:
				getDates().clear();
				return;
			case CalenderPackage.CALENDER__PERSONS:
				getPersons().clear();
				return;
			case CalenderPackage.CALENDER__MONTHS:
				getMonths().clear();
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
			case CalenderPackage.CALENDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CalenderPackage.CALENDER__DATES:
				return dates != null && !dates.isEmpty();
			case CalenderPackage.CALENDER__PERSONS:
				return persons != null && !persons.isEmpty();
			case CalenderPackage.CALENDER__MONTHS:
				return months != null && !months.isEmpty();
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
			case CalenderPackage.CALENDER___SHOW_GUI:
				showGui();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CalenderImpl
