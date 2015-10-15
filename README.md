# FileSpammer
The Java based disk stress test

We are pretty sure if you leave this open for long enough you should be able to stress test your hard drive. Please note that we still do not know the long term consequences of running this program for extended periods of time and what effects it may have on your hard drive and/or filesystem. 

Effectiveness
=============
We are yet to evaluate how effective this program actually is in stress testing a hard drive. We will be conducting tests on OS X, Windows, and Linux based machines with the HFS+, NTFS, and ext4fs filesystems respectively to see how this program actually affects the stress on a hard disk. 

Rewrite coming soon
==================
This implementation is pretty bad. The concept will remain the same but almost all of the source code will be changed.

jDiskStressTester
=================
jDiskStressTester, a conceptual successor to FileSpammer, has been released! It features the ability to specify how many files you want created, as well as a timer to see how long it took to generate those files along with the ability to enable/disable verbose file creation print outs. *THE CODE FOR FILESPAMMER WILL NO LONGER BE MAINTAINED. IT WILL REMAIN ON GITHUB ONLY FOR REFERENCE.*
