/**
 */
package de.tu_bs.vacation_manager.Calender;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Working Day Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.vacation_manager.Calender.CalenderPackage#getWorkingDayType()
 * @model
 * @generated
 */
public enum WorkingDayType implements Enumerator {
	/**
	 * The '<em><b>Working Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING_DAY(0, "WorkingDay", "WorkingDay"),

	/**
	 * The '<em><b>Holyday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLYDAY_VALUE
	 * @generated
	 * @ordered
	 */
	HOLYDAY(1, "Holyday", "Holyday"),

	/**
	 * The '<em><b>Vacation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VACATION_VALUE
	 * @generated
	 * @ordered
	 */
	VACATION(2, "Vacation", "Vacation"),

	/**
	 * The '<em><b>Public Holyday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_HOLYDAY_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_HOLYDAY(3, "PublicHolyday", "PublicHolyday");

	/**
	 * The '<em><b>Working Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Working Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKING_DAY
	 * @model name="WorkingDay"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_DAY_VALUE = 0;

	/**
	 * The '<em><b>Holyday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Holyday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOLYDAY
	 * @model name="Holyday"
	 * @generated
	 * @ordered
	 */
	public static final int HOLYDAY_VALUE = 1;

	/**
	 * The '<em><b>Vacation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vacation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VACATION
	 * @model name="Vacation"
	 * @generated
	 * @ordered
	 */
	public static final int VACATION_VALUE = 2;

	/**
	 * The '<em><b>Public Holyday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public Holyday</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_HOLYDAY
	 * @model name="PublicHolyday"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_HOLYDAY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Working Day Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkingDayType[] VALUES_ARRAY =
		new WorkingDayType[] {
			WORKING_DAY,
			HOLYDAY,
			VACATION,
			PUBLIC_HOLYDAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Working Day Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkingDayType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Working Day Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkingDayType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkingDayType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Working Day Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkingDayType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkingDayType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Working Day Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkingDayType get(int value) {
		switch (value) {
			case WORKING_DAY_VALUE: return WORKING_DAY;
			case HOLYDAY_VALUE: return HOLYDAY;
			case VACATION_VALUE: return VACATION;
			case PUBLIC_HOLYDAY_VALUE: return PUBLIC_HOLYDAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WorkingDayType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //WorkingDayType
