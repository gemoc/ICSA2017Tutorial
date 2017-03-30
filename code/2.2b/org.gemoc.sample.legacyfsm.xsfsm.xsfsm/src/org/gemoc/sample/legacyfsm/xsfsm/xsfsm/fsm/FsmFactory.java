/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage
 * @generated
 */
public interface FsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmFactory eINSTANCE = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Number Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Variable</em>'.
	 * @generated
	 */
	NumberVariable createNumberVariable();

	/**
	 * Returns a new object of class '<em>Equal Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Number Guard</em>'.
	 * @generated
	 */
	EqualNumberGuard createEqualNumberGuard();

	/**
	 * Returns a new object of class '<em>Number Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Action</em>'.
	 * @generated
	 */
	NumberAction createNumberAction();

	/**
	 * Returns a new object of class '<em>Less Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Than Number Guard</em>'.
	 * @generated
	 */
	LessThanNumberGuard createLessThanNumberGuard();

	/**
	 * Returns a new object of class '<em>Greater Than Number Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Number Guard</em>'.
	 * @generated
	 */
	GreaterThanNumberGuard createGreaterThanNumberGuard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FsmPackage getFsmPackage();

} //FsmFactory
