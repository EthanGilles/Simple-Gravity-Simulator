# Simple-Gravity-Simulator
--------------------------

There are arrays filled with particles that we can apply rules to. These rules impact the way that the particles interact with eachother based on the force applied to them, which is set when creating a rule. 

The final goal is to have an intricate system of particles with rules that are somewhat realistic to simulate cell-like formations.

Currently, I have particles oscilating around eachother, bouncing off the sides of the screen.

<h2>Rules</h2>

A 'Rule' has the following parameters:

1. Particles Force is being applied to (p1)
2. Partciles Force is coming from (p2)
3. Force, negative for attraction, postive for repulsion. (g)

The 'Rule' method looks as follows

<img src="https://github.com/EthanGilles/Simple-Gravity-Simulator/blob/main/screenshots/rulecode.png">
--------------------------------------------------------------------------------------------------
<h2>Current Progress</h2>

Currently, I have particles that will oscilate, but not really interact the way I would like. I want particles that are attracted to stay in the middle while ones repulsed gather around it, holding it central, like a nucleus in a cell. Currently, it seems some of the algorithm is off as I can't get this interaction to occur. Instead, particles will just kinda fly all over the place, weaving between other particles. For now I am keeping it like this, while I work on bugs.

Current Progress Shown in the JVM Frame:

<img src="https://github.com/EthanGilles/Simple-Gravity-Simulator/blob/main/screenshots/rungif.gif">
