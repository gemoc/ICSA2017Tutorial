package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import java.util.Map;
import org.gemoc.sample.legacyfsm.fsm.AssignValueAction;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.AssignValueActionAspectAssignValueActionAspectProperties;

@SuppressWarnings("all")
public class AssignValueActionAspectAssignValueActionAspectContext {
  public final static AssignValueActionAspectAssignValueActionAspectContext INSTANCE = new AssignValueActionAspectAssignValueActionAspectContext();
  
  public static AssignValueActionAspectAssignValueActionAspectProperties getSelf(final AssignValueAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.fsm.k3dsa.AssignValueActionAspectAssignValueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AssignValueAction, AssignValueActionAspectAssignValueActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.fsm.AssignValueAction, org.gemoc.sample.legacyfsm.fsm.k3dsa.AssignValueActionAspectAssignValueActionAspectProperties>();
  
  public Map<AssignValueAction, AssignValueActionAspectAssignValueActionAspectProperties> getMap() {
    return map;
  }
}
