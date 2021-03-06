/**
 */
package fsmTrace.States.fsm;

import fsmTrace.States.StateMachine_currentState_Value;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getCurrentStateSequence <em>Current State Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine()
 * @model
 * @generated
 */
public interface TracedStateMachine extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Current State Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.StateMachine_currentState_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.StateMachine_currentState_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_CurrentStateSequence()
	 * @see fsmTrace.States.StateMachine_currentState_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<StateMachine_currentState_Value> getCurrentStateSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(StateMachine)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_OriginalObject()
	 * @model
	 * @generated
	 */
	StateMachine getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedStateMachine#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(StateMachine value);

} // TracedStateMachine
