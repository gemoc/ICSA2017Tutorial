# ICSA Tutorial


This tutorial provides a practical approach for developing and integrating various Domain-Specific (modeling) Languages (DSLs) used in the development of modern complex software-intensive systems, with the main objective to support abstraction and separation of concerns. The tutorial leverages on the tooling provided by the GEMOC studio to present the various facilities offered by the Eclipse platform (incl., EMF/Ecore, Xtext, Sirius) and introduces the advanced features to extend a DSL with a well-defined execution semantics, possibly including formal concurrency constraints and coordination patterns. From such a specification, we demonstrate the ability of the studio to automatically support model execution, graphical animation, omniscient debugging, concurrency analysis and concurrent execution of heterogeneous models. The tutorial is composed of both lectures and hands-on sessions. Hands-on sessions allow participants to experiment on a concrete use case of an architecture description language used to coordinate heterogeneous behavioral and structural components.

## What will you develop

During this tutorial, the participants will develop a simplified version of the MontiArc component & connector ADL. The ADL is tailored for designing component-based distributed interactive systems that reliy on state-based models to describe component behavior. You will use the GEMOC Studio to develop a simplified version of MontiArc, including  syntax and semantics, and deploy it in the modeling workbench to edit, execute, animate and debug conforming models. In the modeling workbench, the participants will design a software architecture based on predefined components. Based on such a design, participants will be able to concurrently execute the various components according to the execution semantics (message passing) of MontiArc, to graphically animate the architecture, and to debug the system behavior.

## Slides

- The slides for the tutorials are available on [https://github.com/gemoc/ICSA2017Tutorial/tree/master/slides]
- The solution is available [here]()
- Most of the documentations on Gemoc approches are available [here](http://gemoc.org/gemoc-studio/publish/guide/html_single/Guide.html).


You can refer to the documentation at any time.

## Step 1 (Slides Only)
- Language Engineering with Gemoc
- Monti Arc Introduction


## Step 2: Build a simple finite state machine language for specifying your component behavior.

### 2.1 Let us start from FSM Sequential example that exists in Gemoc Studio

- Open your gemoc Studio
- Go to a new workspace.
- Go to File -> new -> Example -> Select Gemoc FSM Language (Sequential)

![](figs/NewExample.png)

Let us understand the structure of the project.

You got the general structure of a DSL project.
- **org.gemoc.sample.legacyfsm.fsm.model** (contains the metamodel (AST) of your language)
- **org.gemoc.sample.legacyfsm.fsm.model.edit** (contains the metamodel helper classes of your metamodel (mainly Observer and Visitor Pattern))
- **org.gemoc.sample.legacyfsm.fsm.model.editor** (Generate a generic tree based editor for your FSM Model)
- **org.gemoc.sample.legacyfsm.fsm** (Contains the DSL desciption (melange file) for your FSM language)
- **org.gemoc.sample.legacyfsm.fsm.design** (Contains graphical respresentation desciption for you FSM model (Sirius based))
- **org.gemoc.sample.legacyfsm.xsfsm** (Contains the DSL desciption (melange file) for your FSM language)
- **org.gemoc.sample.legacyfsm.xsfsm.design** (Contains graphical respresentation extensio for you FSM model (Sirius Animator))
- **org.gemoc.sample.legacyfsm.xsfsm.trace** (Contains the generated project for efficient executable trace management)
- **org.gemoc.sample.legacyfsm.xsfsm.xsfsm** (Generated executable FSM metamodel resulting from the org.gemoc.sample.legacyfsm.xsfsm language specification (melange file))


### 2.2 Lets us play with this language.

1. Start a modelling workbench.
![](figs/runmodellinglanguage.png)

2. Get the example for (Gemoc Model for FSM Sequential)

![](figs/NewExampleModelling.png)

- Open the bitshifting.aird file.
You can see and edit a FSM model.

Next Run this model.

Open the run dialog:
- Run in debug mode the **BitShifting.fsm 000101010** run configuration.

You can play with the debug model

![](figs/xfsmdemo.png)

:warning:
You can now close the modelling workbench


### 2.3 Adding new concepts in your language

Just open your FSM metamodel in the language workbench.

1. Add the concept of Variable that has a name to the FSM. Add three subclasses : a String variable a boolean Variable and a Number Variable.

![](figs/Variable.png)

1. Add the concept of Guard to the Transition. Add eight subclasses : a *StringGuard*, a *BooleanGuard* and an abstract *NumberGuard*, a *EqualNumberGuard*, 	a class *LessThanNumberGuard* that extends *NumberGuard*;
	a class GreaterThanNumberGuard that extends *NumberGuard*, a class *GreaterOrEqualThanNumberGuard* that extends *NumberGuard*, a class *LessOrEqualThanNumberGuard* that extends *NumberGuard*.


![](figs/guard.png)


1. Add the concept of Action to the Transition. Add three subclasses : a StringAction a BooleanAction and a NumberAction.

![](figs/Actions.png)

:warning:
At the end of this task, you must regenerate the Java code for your metamodel.

Do a right clic on the genmodel. Select reload. Next open it and in the tree editor, regenerate all.

![](figs/reload.png)
![](figs/generateall.png)



### 2.4 Add OCL constraints


In our language, you can your static semantics using OCL. Let us try to define that a state cannot have two outgoing transition with the same label without a guard.


### 2.5 Complete the Dynamic semantics.

We provide an implementation of the dynamic semantics.

At that step, we propose to restart from our current version for a lack of time. Just delete all your project. And get import the project from folder step2.5.

In this step, in the file /org.gemoc.sample.legacyfsm.fsm.k3dsa/src/org/gemoc/sample/legacyfsm/fsm/k3dsa/tfsmAspects.xtend, we provide an exerpt of the operational semantics of this language. It is implemented using Xtend and K3 using the [Interpreter Design Pattern](https://en.wikipedia.org/wiki/Interpreter_pattern).

We let two methods unimplemented with TODO. Let us try to implement these two methods.

:warning:
The Execution Functions define how the Execution Data evolve during the execution of the model. Execution Functions can be implemented by defining the body of a method.

These methods must have the @Step annotation.

Whenever a method with an @Step annotation returns, the changes in the model will be applied (via a transaction) to the resource. This means that the changes will be visible from an animator.

The technology used be K3 with its @Step annotation allows nested call so that changes in the model will be applied when entering and leaving methods having this annotations.

:warning:
Defining the entry point

The sequential engines will use as entry point methods having an @Main annotation.

This annotation must be placed on operations applicable to the root model element.

### 2.6 Test the execution of the model with its new semantics

Let's run the modelling workbench

Create a FSM model with two steps and one transition. Create a variable **a** with 1 as an inital step. Create a guard associated to the transition that checks if *a == 1*.  Create an action that set 2 to the variable a.

![](figs/extendedmodel.png)

Lets us debug this model.

1. Create the debug configuration.


![](figs/debugconfiguration.png)

2. You can debug your language

![](figs/executingfsmextended.png)





## Step 3 Let us doing the integration between of a component metamodel.

Let us design the monticore metamodel. We provide you the meta model, the odesign and the initial semantics.

In this step, we propose to show you how we could use sirius to specify the graphical respresentation of a language.

[Documentation](https://www.eclipse.org/sirius/doc/specifier/diagrams/Diagrams.html) is available here.

We propose to manage the link between ports using Sirius. To do that, we have to do two taks:
1. Explaining what you have to draw when for each Intermediate Connctor in the model.
2. Explaining what you have to draw and set when you draw a connector in the diagram.

Let us import an example of model (Project Test) to understand the current diagram specification in the modelling workbench.

Let us open */Test/bumperbot/BumperBot.aird* file.
And in the project explorer, let us open the BumperBot diagram. See snaphshot below.

![](figs/BumperBot.png)


In the modelling workbench, let us also import the project *ur1.diverse.xmontiarc.design*. The good things is that an odesign project is interpreted. As a result, you can modify the odesign diagram specification and just reload the diagram to see the impact.


Sirius is organized to query the model and create representation from the results of the queries. To draw the connector, we have to find each couple of port between which the connector must be drawn.

Let us create an element based edge. On the default Viewpoint, create a new Element based Edge.  You can customize the style. Next you have to specify the query. In out case, all the IntermediateConnector that have a source and a target and we map the border of the source and the border of the target. Finding the source and the target can be done using Java and AQL. We propose to use Java.

![](figs/odesignTask1.png)

Next, we have to create the action to do when we draw a new IntermediateConnector between port.

In section *Edge Section Connector* in the odesign, let us create a new Edge Creation.

![](figs/edgeCreation.png)

This node gives you five subelements. Four that defines the source and the target model elements pointed by your edge, the source and the target views pointed by your edge. Finally it gives the action to execute when creating this edge. Basically, we will change the execution context for this action, create two variable and call an external Java Action already define. The source code of this action is the following.


```Java
package ur1.diverse.xmontiarc.design;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IntermediateConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcFactory;

public class CreateIntermediateConnectorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		OutgoingPort subcomponentOut = (OutgoingPort) options.get("source");
		IncomingPort subcomponentIn = (IncomingPort) options.get("target");

		Subcomponent sourceSubcomponent = (Subcomponent) options.get("sourceSubcomponent");
		ComponentType type = sourceSubcomponent.getParent();
		System.out.println("CreateIntermediateConnectorAction.execute(): Containing component type is '" + type.toString() + "'.");
		IntermediateConnector con = XmontiarcFactory.eINSTANCE.createIntermediateConnector();
		con.setSource(subcomponentOut);
		con.setTarget(subcomponentIn);
		con.setParent(type);
		System.out.println("CreateIntermediateConnectorAction.execute(): Created connector '" + con.toString() + "'.");
		type.getConnectors().add(con);
		try {
			type.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("CreateIntermediateConnectorAction.execute(): Connectors now is '" + type.getConnectors() + "'.");
	}

}
```

You can see in the next figures, the different configuration for these elements.

![](figs/changeContext.png)
![](figs/setsource.png)
![](figs/settarget.png)
![](figs/callExternalJavaAction.png)

Please refer to Sirius documentation for learning and you can configure in details your editor.

[Documentation](https://www.eclipse.org/sirius/doc/specifier/diagrams/Diagrams.html) is available here.


## Step 4. Language composition.

In this step, we will do the most tricky stuffs of this tutorial. We would create a new language in composing our extended Finite State Machine with the monticore metamode.

To do that, we will us melange that let you create a language in assemblying several sublanguage.

For this task, we prepare the composition. Please import the project from the [following archive file](3.0/3.0.zip).

Please open */ur1.diverse.xmontiarc.xdsml.withautomaton/src/ur1/diverse/xmontiarc/xdsml/withautomaton/xmonticorewithautomon.melange*, you will see that we can create a new language which is a composition of xmonticore and the FSM in merging StateMachine with  AutomatonComponentBehavior.  

```java
language XMontiArcWithAutomaton inherits XMontiArc{
	merge XSFSM renaming {"fsm" to "xmontiarc" {"StateMachine" to "AutomatonComponentBehavior" }}
}
```

It remains to create Glue clode for the sematics. Lets do that together.
