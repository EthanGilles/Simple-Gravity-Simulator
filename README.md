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
<h2>Using the Program</h2>

To create a new rule, just add another rule method to the 'paint()' method in myPanel. This updates the current position of the particle right before all of the particles are drawn onto the panel.
To add different particles, go to the 'myPanel()' constructor and do allParticles.add(Particle[] array). 
Particle arrays can be initialized when initializing the class, where I just have four predefined arrays: Red, Blue, Green, Yellow. 
A Particle array can be created and filled with particles by calling "createParticles(int numParticles, Color colorOfParticles)"

<h2>Current Progress</h2>

Currently, I have particles that will oscilate, but not really interact the way I would like. I want particles that are attracted to stay in the middle while ones repulsed gather around it, holding it central, like a nucleus in a cell. Currently, it seems some of the algorithm is off as I can't get this interaction to occur. Instead, particles will just kinda fly all over the place, weaving between other particles. For now I am keeping it like this, while I work on bugs.

Current Progress Shown in the JVM Frame:

<img src="https://github.com/EthanGilles/Simple-Gravity-Simulator/blob/main/screenshots/rungif.gif">

More examples:

Note, in this one, blue isnt attracted to itself, just the red particles.
Same goes for the yellow, being atrracted only to the green.
However, the red is attracted to itself, and so is the green.

<img src="https://github.com/EthanGilles/Simple-Gravity-Simulator/blob/main/screenshots/rungif2.gif">


In this one you can see some more advanced movement coming out. With the red and blue chasing away yellow but not green.
Some of the sling shots and small little orbitals in just a 10 second period can be interesting to trace.
Its also fun to watch how certain clusters break apart, just to reform, then instantly break again, with lone particles being distant from massive collisions.
Keep in mind these particles do have a max velocity or they would just slingshot eachother into an infinite speed, causing some chaos.
<img src="https://github.com/EthanGilles/Simple-Gravity-Simulator/blob/main/screenshots/rungif4.gif">



