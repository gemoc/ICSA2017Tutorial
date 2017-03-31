package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import java.util.Map;
import org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspectDecreaseValueActionAspectProperties;

@SuppressWarnings("all")
public class DecreaseValueActionAspectDecreaseValueActionAspectContext {
  public final static DecreaseValueActionAspectDecreaseValueActionAspectContext INSTANCE = new DecreaseValueActionAspectDecreaseValueActionAspectContext();
  
  public static DecreaseValueActionAspectDecreaseValueActionAspectProperties getSelf(final DecreaseValueAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspectDecreaseValueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DecreaseValueAction, DecreaseValueActionAspectDecreaseValueActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction, org.gemoc.sample.legacyfsm.fsm.k3dsa.DecreaseValueActionAspectDecreaseValueActionAspectProperties>();
  
  public Map<DecreaseValueAction, DecreaseValueActionAspectDecreaseValueActionAspectProperties> getMap() {
    return map;
  }
}
