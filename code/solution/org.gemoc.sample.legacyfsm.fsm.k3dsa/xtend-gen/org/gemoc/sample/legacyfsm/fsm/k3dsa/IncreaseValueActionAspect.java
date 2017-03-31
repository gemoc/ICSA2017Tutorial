package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.ActionAspect;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.IncreaseValueActionAspectIncreaseValueActionAspectProperties;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = IncreaseValueAction.class)
@SuppressWarnings("all")
public class IncreaseValueActionAspect extends ActionAspect {
  @Step
  public static void execute(final IncreaseValueAction _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.IncreaseValueActionAspectIncreaseValueActionAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.IncreaseValueActionAspectIncreaseValueActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.sample.legacyfsm.fsm.k3dsa.IncreaseValueActionAspect._privk3_execute(_self_, (org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"IncreaseValueAction","execute");
    					} else {
    						fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    						if (eventManager != null) {
    							eventManager.manageEvents();
    						}
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.gemoc.sample.legacyfsm.fsm.Action){
    					org.gemoc.sample.legacyfsm.fsm.k3dsa.ActionAspect.execute((org.gemoc.sample.legacyfsm.fsm.Action)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final IncreaseValueActionAspectIncreaseValueActionAspectProperties _self_, final IncreaseValueAction _self) {
    InputOutput.<String>println("execute numerical value");
    final NumberVariable target = _self.getTarget();
    int _value = NumberVariableAspect.value(target);
    int _stepValue = _self.getStepValue();
    int _plus = (_value + _stepValue);
    NumberVariableAspect.value(target, _plus);
  }
}
