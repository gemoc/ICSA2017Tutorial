package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.NumberVariable;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.ActionAspect;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspectDecreaseValueActionAspectProperties;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.NumberVariableAspect;

@Aspect(className = DecreaseValueAction.class)
@SuppressWarnings("all")
public class DecreaseValueActionAspect extends ActionAspect {
  @Step
  public static void execute(final DecreaseValueAction _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspectDecreaseValueActionAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspectDecreaseValueActionAspectContext.getSelf(_self);
     if (_self instanceof org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspect._privk3_execute(_self_, (org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"DecreaseValueAction","execute");
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
  
  protected static void _privk3_execute(final DecreaseValueActionAspectDecreaseValueActionAspectProperties _self_, final DecreaseValueAction _self) {
    InputOutput.<String>println("execute numerical value");
    final NumberVariable target = _self.getTarget();
    int _value = NumberVariableAspect.value(target);
    int _stepValue = _self.getStepValue();
    int _minus = (_value - _stepValue);
    NumberVariableAspect.value(target, _minus);
  }
}
